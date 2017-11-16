class Arge
{
  public:
  static int nbYear(int p0, double percent, int aug, int p);
};

int Arge::nbYear(int p0, double percent, int aug, int p){
    int year = 0; //num of years to return
    while (p0 < p) { //checks p0 is still less than p
      p0 = p0 + (p0 * (percent/100)) + aug; //increases population according to the model
      year++; //adds a year for the year that just passed
    }
    return year; //returns the num of years
  }
  
void testequal(int ans, int sol) {
    Assert::That(ans, Equals(sol));
}
void dotest(int p0, double percent, int aug, int p, int expected)
{
    testequal(Arge::nbYear(p0, percent, aug, p), expected);
}
Describe(nbYear_Tests)
{
    It(Fixed__Tests)
    {
        dotest(1500, 5, 100, 5000,15);
        dotest(1500000, 2.5, 10000, 2000000, 10);
        dotest(1500000, 0.25, 1000, 2000000, 94);
        dotest(1500000, 0.25, -1000, 2000000, 151);
    }
};

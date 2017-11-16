function countPositivesSumNegatives($input) {
    $result = [0, 0]; //resulting array
    for ($i= 0; $i < sizeof($input); $i++) { //iterates through $input
      if ($input[$i] > 0) { $result[0]++; } //if greater than 0 (positive) add1 to $result[0]
      else { $result[1]+=$input[$i]; } //if less than 0 (negative) add that element to $result[1]
    }
    return $result; //return array
}

class CountPositivesSumNegativesTestCases extends TestCase
{
    public function testExample() {
      $this->assertSame([10, -65], countPositivesSumNegatives([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]));
      $this->assertSame([8, -50], countPositivesSumNegatives([0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14]));
    }
}

function series_sum($n) {
  $bottom = 1; #initial denominator
  $sum = 0; #running sum
  for ($i = 1; $i <= $n; $i++) { #iteration for each value up to the nth
    $number = 1/$bottom; #finds the vale of ith number in the series
    $sum += $number; #adds number to the running total
    $bottom += 3; #increments the denominator for the next value in the series
  }
  return "" + round($sum, 2); #returns sum up to nth number as a string
}

class SeriesSumTest extends TestCase {
  public function testExamples() {
    $this->assertEquals('1.00', series_sum(1));
    $this->assertEquals('1.25', series_sum(2));
    $this->assertEquals('1.39', series_sum(3));
    $this->assertEquals('1.49', series_sum(4));
  }
}

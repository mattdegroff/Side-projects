def persistence(n):
    #recursive
    steps = 0
    if n < 10: #base case, if already a single digit
        return steps
    else:
        num = 1 #output of multiplying together
        for x in str(n): #multiplys digits together
            num *= int(x)
        steps += 1
        return steps + persistence(num)

Test.it("Basic tests")
Test.assert_equals(persistence(39), 3)
Test.assert_equals(persistence(4), 0)
Test.assert_equals(persistence(25), 2)
Test.assert_equals(persistence(999), 4)

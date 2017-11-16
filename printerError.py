def printer_error(s):
    error = 0 #num of errors
    for x in s: #checks every letter in s
        if ord(x) not in range (ord('a'), ord('n')): 
            error += 1 #adds 1 to error if not found in range
    return "%d/%d" % (error, len(s)) #returns string
    
Test.describe("printer_error")
Test.it("Basic tests")
s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"
Test.assert_equals(printer_error(s), "3/56")

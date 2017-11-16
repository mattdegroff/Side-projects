def disemvowel(string):
    string1 = "" #string to be returned
    vowels = ['a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'] #vowels
    for x in string: #checks every char in string
        if x not in vowels: 
            string1 += x # if x not in vowels, adds to new string
    return string1 #returns new string
    
 test.assert_equals(disemvowel("This website is for losers LOL!"),
                              "Ths wbst s fr lsrs LL!")

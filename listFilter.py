def filter_list(l):
  'return a new list with the strings filtered out'
  filter = [] #filtered list
  for x in range(0, len(l)): #for loop to check elements
      if isinstance(l[x], int): #checks if element is int
          filter.append(l[x]) #if int, adds to filtered list
  return filter #returns filtered list
  
test.assert_equals(filter_list([1,2,'a','b']),[1,2])
test.assert_equals(filter_list([1,'a','b',0,15]),[1,0,15])
test.assert_equals(filter_list([1,2,'aasf','1','123',123]),[1,2,123])

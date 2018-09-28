def fromDecimal(x, base):
    result = []
    convert = int(x)
    if (int(base) > 9):
        print("Error, base cannot be greater than 9")
    else: 
        while (convert > 0):
            num = convert % int(base)
            convert = (int) (convert / int(base))
            result.append([convert, num])
        result = list(reversed(result))
        print(x, "base ", base," = ", end="")
        for i in range(len(result)):
            print(result[i][1], end="")
print("Enter num to convert:")
x = input()
print("Enter base to convert it to:")
y = input()
fromDecimal(x, y)
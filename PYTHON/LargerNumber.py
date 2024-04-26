a = int(input("Enter first number : "))
b = int(input("Enter second number : "))
c = int(input("Enter third number : "))
if(a>=b and a>=c):
    print("a is greater",a)
elif(b>=a and b>=c):
    print("b is graeter",b)
else:
    print("c is greater",c)
marks = int(input("Enter the marks : "))

if(marks>100):
    print("Invalid marks")

elif(marks >= 90 and marks <= 100):
    print("A grade")

elif(marks >= 80 and marks < 90):
    print("B grade")

elif(marks >= 70 and marks < 80):
    print("C grade")

else:
    print("D grade")

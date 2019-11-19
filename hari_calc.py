def add(x, y):
   return x + y 
def sub(x, y):
   return x - y 
def mul(x, y):
   return x * y 
def div(x, y): 
   return x / y  
 
print("Select operation.")  
print("1.Add")  
print("2.Subtract")  
print("3.Multiply")  
print("4.Divide")  
while True: 
    choice = input("Enter choice(1/2/3/4):")  
    try: 
        if choice == '1':
            num1 = float(input("Enter first number: "))  
            num2 = float(input("Enter second number: "))
            print(num1,"+",num2,"=", add(num1,num2))
            break
        elif choice == '2':
            num1 = float(input("Enter first number: "))  
            num2 = float(input("Enter second number: "))
            print(num1,"-",num2,"=", sub(num1,num2))
            break
        elif choice == '3':
            num1 = float(input("Enter first number: "))  
            num2 = float(input("Enter second number: "))
            print(num1,"*",num2,"=", mul(num1,num2))
            break
        elif choice == '4':
            num1 = float(input("Enter first number: "))  
            num2 = float(input("Enter second number: "))
            print(num1,"/",num2,"=", div(num1,num2))
            break
        else:  
            print("Invalid choice")
            continue
    except:
        print("enter values not strings")

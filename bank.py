import random
random=random.randint(1000,2000)
dic={}
l=[]
print("WELCOME TO OUR BANK")
while True:
    createAcc=input("Create Account(CA)/Login with Existing Account(login) :")
    if(createAcc=="CA"):
        x=random
        print(type(x))
        print("Your Account number is:",x)
        name=input("Your Name :")
        pas=input("Your Password :")
        bal=int(input("please deposit 5000Rs to activate your Account:"))
        if(bal>=5000):
            l.append(x)
            l.append(name)
            l.append(pas)
            l.append(bal)
            dic[x]=l
        else:
            print("your Account can't be created Try later")
            continue
    else:
        while True:
            acc=input("Enter your Account number:")
            while True:
                for i in dic.values():
                    for j in i:
                        print(i[0])
                        if(acc==i[0]):
                            while True:
                                username=input("Enter your username :")
                                passw=input("Enter your password")
                                choice=input("Enter your choice(Deposit(D),Withdraw(W),Balance(B) :")
                                if(choice=="D"):
                                    deposit=int(input("How much do you like to deposit :"))
                                    balance=i[3]+deposit
                                    print(deposit,"rs credited in your Account...your balance is:",balance)
                                    ce=input("Do you like to continue(C) or exit(E):")
                                    if(ce=="C"):
                                        continue
                                    elif(ce=="E"):
                                        break
                                if(ce=="C"):
                                    continue
                                elif(ce=="E"):
                                    break
                        else:
                            io="2"
                            print("invalid acc number")
                            break
                    if(io=="2"):
                        break
                        
                if(io=="2"):
                    break    
        
        

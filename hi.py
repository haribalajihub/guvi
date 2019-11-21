complier vs interpreter
naming a variable(principles)
python 2.7 vs 3
diff if vs switch
does python has switch 

132
132
123

import sys
x=''
try:
    username = input("Please enter your name:")
    if(type(username)==int):
        print("number")
        sys.exit()
    if not username:
        raise ValueError('Warning:Please enter your name')
except ValueError as e:
    print(e)
    sys.exit()
try:
    source = input("Enter the source point:")
    source=float(source)
    if not source:
        raise ValueError('Please enter your source')
    if(source<0):
        print("please provide positive source point")
        sys.exit()
except ValueError:
    print('\nYou did not enter a valid source value')
    sys.exit()
try:
    desi = input("Enter the destination point:")
    desi=float(desi)
    if not desi:
        raise ValueError('Please enter your destination')
    
except ValueError:
    print('\nYou did not enter a valid destination value')
    sys.exit()

if(source<desi):
    des=desi
else:
    print("please enter destination point greater than source point")
    sys.exit()

try:
    cat =input("Please select your category:1.Auto,2.Cab,3.Car:")
    cat=float(cat)
    cat=round(cat)
    if not cat:
        raise ValueError('Please select your category')
    if(type(cat)==int):
        if(cat==1 or cat==2 or cat==3):
            x=cat
        else:
            print("invalid category")
    elif(type(cat)==str):
        print("provide number not string")
        
    
except ValueError:
    print("enter int value")
    sys.exit()
    
if(x==1):
    y=(des-source)*5
    print()
    print("INVOICE")
    print("Name:",username)
    print("Source:",source)
    print("Destination:",des)
    print("Category: Auto")
    print("Pay:",y)
if(x==2):
    y=(des-source)*10
    print()
    print("INVOICE")
    print("Name:",username)
    print("Source:",source)
    print("Destination:",des)
    print("Category: Cab")
    print("Pay:",y)
if(x==3):
    y=(des-source)*12
    print()
    print("INVOICE")
    print("Name:",username)
    print("Source:",source)
    print("Destination:",des)
    print("Category: Car")
    print("Pay:",y)






































import sys
x=''
def uname():
    while True:
        username=input("Please enter your name:")
        if(username!=""):
            try:
                #username = input("Please enter your name:")
                if(type(username)==int):
                    print("number")
                    sys.exit()
                if not username:
                    raise ValueError('Warning:Please enter your name')
            except ValueError as e:
                print(e)
            break
            
        else:
            print("enter  valid name")
            continue
            

    return username
        
def source():
    while True:
        source = input("Enter the source point:")
        if(source!=""):
            try:
                source=float(source)
                if not source:
                    raise ValueError('Please enter your source')
                if(source<0):
                    print("please provide positive source point")
                    source()
            except ValueError:
                print('\nYou did not enter a valid source value')
                source()
            break
        else:
            print("enter valid source point")
            continue
    return source
def des(source1):
    while True:
        desi = input("Enter the destination point:")
        if(desi!=""):
            try:
                desi=float(desi)
                if not desi:
                    raise ValueError('Please enter your destination')
                
            except ValueError:
                print('\nYou did not enter a valid destination value')
                des()
            
            if(source1<desi):
                des=desi
            else:
                print("please enter destination point greater than source point")
                des()
        else:
            print("enter valid source point")
            continue
    return des
def cat(username,so,de):
    cat =input("Please select your category:1.Auto,2.Cab,3.Car:")
    while True:
        if cat!="" :
            try:
                
                cat=float(cat)
                cat=round(cat)
                if not cat:
                    raise ValueError('Please select your category')
                if(type(cat)==int):
                    if(cat==1 or cat==2 or cat==3):
                        x=cat
                    else:
                        print("invalid category")
                elif(type(cat)==str):
                    print("provide number not string")
                    
                
            except ValueError:
                print("enter int value")
                cat()
            
            if(x==1):
                y=(de-so)*5
                print()
                print("INVOICE")
                print("Name:",username)
                print("Source:",so)
                print("Destination:",de)
                print("Category: Auto")
                print("Pay:",y)
            if(x==2):
                y=(de-so)*10
                print()
                print("INVOICE")
                print("Name:",username)
                print("Source:",so)
                print("Destination:",d)
                print("Category: Cab")
                print("Pay:",y)
            if(x==3):
                y=(de-so)*12
                print()
                print("INVOICE")
                print("Name:",username)
                print("Source:",so)
                print("Destination:",de)
                print("Category: Car")
                print("Pay:",y)
        else:
            print("enter valid source point")
            continue
if __name__ == '__main__':
    u=uname()
    source1=source()
    catt=des(source1)
    cat(u,source1,catt)
    print(source1)
    




















132
132























import sys
x=''
def uname():
    while True:
        username=input("Please enter your name:")
        if(username!=""):
            try:
                #username = input("Please enter your name:")
                if(type(username)==int):
                    print("number")
                    sys.exit()
                if not username:
                    raise ValueError('Warning:Please enter your name')
            except ValueError as e:
                print(e)
            break
            
        else:
            print("enter  valid name")
            continue
            

    return username
        
def source():
    while True:
        source = input("Enter the source point:")
        
        if(source!=""):
            try:
                source=float(source)
                if not source:
                    raise ValueError('Please enter your source')
                if(source<0):
                    print("please provide positive source point")
                    continue
            except ValueError:
                print('You did not enter a valid source value')
            break
        else:
            print("enter valid source point")
            continue
    return source
def des(source1):
    while True:
        desi = input("Enter the destination point:")
        if(desi!=""):
            try:
                desi=float(desi)
                if not desi:
                    raise ValueError('Please enter your destination')
                
            except ValueError:
                print('\nYou did not enter a valid destination value')

            
            if(source1<desi):
                des=desi
            else:
                print("please enter destination point greater than source point")
                continue
            break
        else:
            print("enter valid source point")
            continue
    return des
def cat(username,so,de):
    cat =input("Please select your category:1.Auto,2.Cab,3.Car:")
    while True:
        if cat!="" :
            try:
                
                cat=float(cat)
                cat=round(cat)
                if not cat:
                    raise ValueError('Please select your category')
                if(type(cat)==int):
                    if(cat==1 or cat==2 or cat==3):
                        x=cat
                    else:
                        print("invalid category")
                elif(type(cat)==str):
                    print("provide number not string")
                    
                
            except ValueError:
                print("enter int value")
                cat()
            
            if(x==1):
                y=(de-so)*5
                print()
                print("INVOICE")
                print("Name:",username)
                print("Source:",so)
                print("Destination:",de)
                print("Category: Auto")
                print("Pay:",y)
            if(x==2):
                y=(de-so)*10
                print()
                print("INVOICE")
                print("Name:",username)
                print("Source:",so)
                print("Destination:",d)
                print("Category: Cab")
                print("Pay:",y)
            if(x==3):
                y=(de-so)*12
                print()
                print("INVOICE")
                print("Name:",username)
                print("Source:",so)
                print("Destination:",de)
                print("Category: Car")
                print("Pay:",y)
            break
        else:
            print("enter valid source point")
            continue
if __name__ == '__main__':
    u=uname()
    source1=source()
    catt=des(source1)
    cat(u,source1,catt)
    

























print("WELCOME")
dic={}
while 1:
    try:
        a=input("Login with Admin or User:")
        if(a=='admin' or a=='user'):
            while 1:
                try:
                    stu=input("Select student(s1,s2,s3):")
                    try:
                        if(a=="admin"):
                            if(stu=="s1"):
                                s1=int(input("Enter mark of s1:"))
                                dic[stu]=s1
                                break
                            if(stu=="s2"):
                                s2=int(input("Enter mark of s2:"))
                                dic[stu]=s2
                                break
                            if(stu=="s3"):
                                s3=int(input("Enter mark of s3:"))
                                dic[stu]=s3
                                break
                            else:
                                print("select available students")
                                continue
                        elif(a=='user'):
                            if(stu=='s1'):
                                print("s1 mark is:",dic["s1"])
                                break
                            if(stu=='s2'):
                                print("s2 mark is:",dic["s2"])
                                break
                            if(stu=='s3'):
                                print("s3 mark is:",dic["s3"])
                                break
                            else:
                                print("select available students")
                                continue
                        else:
                            print("provide valid login name")
                    except KeyError:
                        print("selected students has no record")
                    except valueError:
                        print("enter value not strings")
        
                except KeyError:
                    print("selected students has no record")
                except valueError:
                    print("enter value not strings")
        else:
            print("enter valid login")
            continue
        ec=input("do you want to exit or continue:")
        if(ec=="exit"):
            break
        else:
            continue
    except KeyError:
        print("selected students has no record")
    except valueError:
        print("enter value not strings")
    

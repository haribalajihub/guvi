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
    

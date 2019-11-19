def uname():
    while True:
        username=input("Please enter your name:")
        if(username!=""):
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
                if(source<0):
                    print("please provide positive source point")
                    continue
                elif(source>=0):
                    break
                else:
                    print("enter valid source point")
                    continue
            except ValueError:
                print("enter valid source point")
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
                if(source1<desi):
                    des=desi
                    break
                else:
                    print("please enter destination point greater than source point")
                    continue
            except ValueError:
                print("enter valid destination point")
        else:
            print("enter valid destination point")
            continue
    return des
def cat(username,so,de):
    while True:
        cat =input("Please select your category:1.Auto,2.Cab,3.Car:")
        if cat!="" :
            try:
                cat=float(cat)
                cat=round(cat)
                if(cat==1 or cat==2 or cat==3):
                    x=cat
                else:
                    print("invalid category")
                    continue
                if(type(cat)==str):
                    print("provide number not string")
                
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
                    print("Destination:",de)
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
            except ValueError:
                print("enter only available category")
        else:
            print("enter only available category")
            continue
if __name__ == '__main__':
    u=uname()
    source1=source()
    catt=des(source1)
    cat(u,source1,catt)

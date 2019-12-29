import math 

def ChessboardTraveling(instr): 
    numup=int(instr[3])-int(instr[0])
    numright=int(instr[2])-int(instr[1])
    first=numup+numright
    second=min(numup, numright)
    
    # code goes here 
    return int(math.factorial(first)/(math.factorial(second)*math.factorial(first-second)))
    
# keep this function call here  
print(ChessboardTraveling(input().split()))

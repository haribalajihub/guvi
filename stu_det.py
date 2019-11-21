import pickle
a=input()
s=input()
dic={"a":"hari","b":"balaji"}
fn="sum.txt"
dic[s]=a
f=open(fn,"wb")
pickle.dump(dic,f)

f=open(fn,"rb")
v=pickle.load(f)

print(dic[s])

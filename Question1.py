# Question:
# Every person has their nickname and name.Check whether two persons has same nickname and name. If so, print "yes" else print "no".

# Ex:
# Input:
# 2-----> testcases
# 3-----> no. of names
# kiran naik
# charan naik
# charan naik
# 2----->no. of names
# ajay naik
# anjali naik
# Output:
# yes ---> for 1st case.
# no ---> for second case.

# code starts from here.
testcases = int(input())


names = []
while(testcases!=0):
    noOfNames = int(input())
    
    for i in range(noOfNames):
        name = input().strip()
        names.append(name)
    uniqueNames = list(set(names))

    if len(names)==len(uniqueNames):
        print("no"+" it doesn't contain duplicate names")
    else:
        print("yes"+" it contains duplicate names")
        
    names.clear()
    
    testcases-=1
    

    
    
    



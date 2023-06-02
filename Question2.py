# Find the product of each digit in a given number.
# Note: Omit the zeroes at the prefix.

# Eg:
# Input:
# 0001234
# output:
# 24
num = list(input().lstrip('0'))
res =1
for i in num:
    x = ord(i)-ord('0')
    res *= x
    
print(res)


"""
12: Complete the series of 10 numbers in the following incomplete series?
        a)  1,  2,  3,   4,    5, ......
        b)  5,  7,  9,  11,   13, ......
        c)  2,  5,  9,  14,   20, ......
        d)  1,  3,  5,  11,   21, ......      (n, n*2+1, n*2-1, n*2+1, n*2-1, ...
"""
seed = 1
for x in range(1, 11):
	print(seed, end=' ')
	if x%2==0:
		seed = seed * 2 - 1
	else:
		seed = seed * 2 + 1

print()
print("------------------------------ Next --------------------------------")

"""
	Print 10 numbers divisible by 5 starting from 5
"""
for x in range(5, 5*11, 5):
	print(x, end=' ')


print()
print("------------------------------ Next --------------------------------")

"""
	WAP to print 10 number in the series 10, 15, 8, 13, 6, 11, 4, 9, ....
"""
seed = 10
for x in range(1, 11):
	print(seed, end=' ')
	if x%2==0:
		seed = seed - 7
	else:
		seed = seed + 5

print()
print("------------------------------ Next --------------------------------")

"""
	Count the number of occurances of each alphabets in a string
		God is Good
		D = 2
		G = 2
		I = 1
		O = 3
		S = 1
"""
count = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
text = "God is Good"
for i in range(0, len(text)):
	each = text[i]
	asc = ord(each)
	if asc>=65 and asc<=90:
		count[asc-65] = count[asc-65]+1
	elif asc>=97 and asc<=122:
		count[asc-97] = count[asc-97]+1

for i in range(0,len(count)):
	if count[i]>0:
		print( chr(i+65),'=',count[i])

print()
print("--------------------------------- Next ----------------------------------")

import keyword
print(keyword.kwlist)

for i in range(0, len(keyword.kwlist)):
	print((i+1),keyword.kwlist[i])

print()

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

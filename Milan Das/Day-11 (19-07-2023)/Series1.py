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
	WAP to reverse a string
		Original text: Quick Brown Fox Jumps Over The Lazy Dog
		Reverse text:  goD yzaL ehT revO spmuJ xoF nworB kciuQ
"""
original = "Quick Brown Fox Jumps Over The Lazy Dog"
reverse = ""

for i in range(len(original)-1, -1, -1):
	reverse = reverse+original[i]

print("Original text: "+original)
print("Reverse text:  "+reverse)

print()
print("------------------------------ Next --------------------------------")

"""
	WAP to print alternate characters in the string
		Quick Brown Fox Jumps Over The Lazy Dog
		QikBonFxJmsOe h ayDg
"""
original = "Quick Brown Fox Jumps Over The Lazy Dog"
for i in range(0, len(original), 2):
	print(original[i], end='')

print()
print("------------------------------ Next --------------------------------")

"""
	WAP to print each digit in a number to words
		573
		Five Seven Three
		49258
		Four Nine Two Five Eight
"""
number = 5537812
numStr = str(number)
for i in range(0,len(numStr)):
	each = numStr[i]
	if each=="0":
		print("Zero",end=" ")
	elif each=="1":
		print("One",end=" ")
	elif each=="2":
		print("Two",end=" ")
	elif each=="3":
		print("Three",end=" ")
	elif each=="4":
		print("Four",end=" ")
	elif each=="5":
		print("Five",end=" ")
	elif each=="6":
		print("Six",end=" ")
	elif each=="7":
		print("seven",end=" ")
	elif each=="8":
		print("Eight",end=" ")
	elif each=="9":
		print("Nine",end=" ")

print()
print("------------------------------ Next --------------------------------")

number = 6537810
digit_names = ["Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"]
numStr = str(number)
for i in range(0, len(numStr)):
	each = int(numStr[i])
	print(digit_names[each], end=" ")

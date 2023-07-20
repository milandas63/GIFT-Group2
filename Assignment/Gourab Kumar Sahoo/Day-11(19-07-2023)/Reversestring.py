
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
	Write a program to reverse all words in a string
"""

# Single line

data = "Quick Brown Fox Jumps Over The Lazy Dog"
dataList = data.split()

for i in range(len(dataList)-1, -1, -1):
	print(dataList[i], end=' ')

print()

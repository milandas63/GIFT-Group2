"""
	Write a program to reverse all words in a string
"""

# Single line

data = "Quick Brown Fox Jumps Over The Lazy Dog"
dataList = data.split()

for i in range(len(dataList)-1, -1, -1):
	print(dataList[i], end=' ')

print()
print("-------------------------------- Next ------------------------------")

for i in range(0, len(dataList)):
	each = dataList[i]
	for j in range(len(each)-1, -1, -1):
		print(each[j], end='')
	print(end=' ')

print()
print("-------------------------------- Next ------------------------------")

"""
	Stretch a string to 50 characters in length by adding dot to make it
	right, center and left justified
"""
my_string = "Gandhi Institute For Technology"
print(my_string.rjust(50,'.'))
print(my_string.center(50,'.'))
print(my_string.ljust(50,'.'))

print()
print("-------------------------------- Next ------------------------------")

# Mutiplication Tables program
start = 2
end = 10
for i in range(2, end+1, 5):
	for j in range(1, 11):
		for k in range(i, i+5):
			if k>end:
				break
			# print(padL(k,2),"x",padL(j,2),"=",padL((k*j),3)," ", end='')
			print(str(k).rjust(2,' '),"x",str(j).rjust(2,' '),"=",str(k*j).rjust(3,' ')," ", end='')
		print()
	print()

print()
print("-------------------------------- Next ------------------------------")

# Prime number program - (from 1000 to 3000)
start = 1000
end = 3000
printno = 0
for i in range(start, end+1):
	yn = True
	for j in range(2, i):
		if i%j==0:
			yn = False
			break
	if yn:
		print(i, end=' ')
		printno = printno+1
		if printno>=12:
			printno = 0;
			print()

print()
print("-------------------------------- Next ------------------------------")

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
print("-------------------------------- End ------------------------------")

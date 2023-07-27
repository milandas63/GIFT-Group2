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

"""
	WAP to perform a calculator's work?

	Simple Calculator
	-----------------
	1. Addition
	2. Substraction
	3. Multiplication
	4. Division
	5. Exit

	Operation [1-5]: 
	Enter first number:	 63
	Enter second number: 54

	117

	More [y/n]: y
"""
add = lambda x, y : x + y
minus = lambda x, y : x - y
multiply = lambda x, y : x * y
divide = lambda x, y : x / y

more = True
while more:
	for i in range(0,10):
		print()
	
	print("Simple Calculator")
	print("-----------------")
	print("1. Addition")
	print("2. Substraction")
	print("3. Multiplication")
	print("4. Division")
	print("5. Exit")
	print()
	print()

	action = input("Operation [1-5]: ")
	if action=="5":
		break

	n1 = int(input("Enter first number:  "))
	n2 = int(input("Enter second number: "))
	
	if action=='1':
		print(add(n1, n2))
	elif action=='2':
		print(minus(n1, n2))
	elif action=='3':
		print(multiply(n1, n2))
	elif action=='4':
		print(divide(n1, n2))

	more = input("More [y/n]: ")=='y'

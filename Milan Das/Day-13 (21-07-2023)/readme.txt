LAMBDA

"""
	LAMBDA FUNCTION
	>	A lambda function is a small anonymous function.
	>	A lambda function can take any number of arguments, but can only have 
		one expression.
		Example:
			lambda a : a*0.05
			lambda principal, rate, time : (principal*rate*time)/100
			lambda devident, dividor : devident % dividor

	WHY USE LAMBDA FUNCTIONS?
	>	The power of lambda is better shown when you use them as an anonymous 
		function inside another function.
	>	Say you have a function definition that takes one argument, and that 
		the argument will be multiplied by an unknown number:

	CLASSWORK: (21-07-2023)
	QUESTION-1
	Write a program to calculate the simple interest value of 10,000
		>	Year = 3, Rate = 6.0
		>	Year = 5, Rate = 5.5
		>   	Year = 8, Rate = 3.5
		Use the Lambda function to evaluate the above problem

	Simple_interest = (principal * rate_of_interest * time_in_year)/100

	QUESTION-2
	Create a lambda function for the problem below:

	EXAMINATION PROCESSING
	1. If the aggregate is pass and the students fail in one subject, 
	   he can get 10 marks grace
	2. If the aggregate is pass and the students fail in two subjects, 
           he can get 8 marks grace
	3. If the aggregate is pass and the students fail in three subjects, 
           he can get 6 marks grace


	File Handling

	There are 4 specific function used for File Handling
	1. open
	2. read
	3. write
	4. close

	The open function takes two arguments:
	1. The file name
	2. The mode of operation

	The mode of operations is as follows:
    =   Mode in the open file:
        Where the following mode is supported:
        r:  open an existing file for a read operation.
        w:  open an existing file for a write operation. If the file already contains some
            data then it will be overridden but if the file is not present then it creates
            the file as well.
        a:  open an existing file for append operation. It won’t override existing data.
        r+: To read and write data into the file. The previous data in the file will be
            overridden.
        w+: To write and read data. It will override existing data.
        a+: To append and read data from the file. It won’t override existing data.

	CLASSWORK:
	Write a program to read the content and print it. The output will appear with one space
	after each character.
		Example:
			Hello World!
			H e l l o   W o r l d !

"""


"""
	File Handling

	There are 4 specific function used for File Handling
	1. open
	2. read
	3. write
	4. close

	The open function takes two arguments:
	1. The file name
	2. The mode of operation

	The mode of operations are as follows:
    =   Mode in open file:
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

"""
with open('gift.txt','r') as fh:
	content = fh.read()
	print(content)
	fh.close()

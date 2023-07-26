"""
Write a program to read the content and print it. The output will appear with one space
	after each character.
		Example:
			Hello World!
			H e l l o   W o r l d !
"""
def print_with_spaces(content):
    spaced_content = ' '.join(content)
    print(spaced_content)
def main():
    file_path = input("Enter the path to the file: ")
    try:
        with open(file_path, 'r') as file:
            content = file.read().strip()
            print_with_spaces(content)
    except FileNotFoundError:
        print("Error: File not found.")
    except Exception as e:
        print(f"An error occurred: {e}")
if __name__ == "__main__":
    main()

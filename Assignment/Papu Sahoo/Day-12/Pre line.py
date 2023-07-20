"""
Write a function that takes a list of strings and prints them, one per line, in a 
	rectangular frame.
    For example the list ["Hello", "World", "in", "a", "frame"]
"""
def print_in_frame(strings):
    max_length = max(len(string) for string in strings)
    print('*' * (max_length + 4))
    for string in strings:
        spaces = max_length - len(string)
        print('* ' + string + ' ' * spaces + ' *')
    print('*' * (max_length + 4))
words = ["Hello", "World", "in", "a", "frame"]
print_in_frame(words)

Output:

********
*Hello *
*World *
*in    *
*a     *
*frame *
********

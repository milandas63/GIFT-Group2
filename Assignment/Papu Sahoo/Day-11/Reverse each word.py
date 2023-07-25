"""
Write a program to reverse the characters of each word in a string 
"""
def reverse_words_in_string(input_string):
    words = input_string.split() 
    reversed_words = [word[::-1] for word in words]  
    output_string = ' '.join(reversed_words)  
    return output# Input string
input_string = "Gandhi Institute For Technology"
reversed_string = reverse_words_in_string(input_string)
print(reversed_string)

Output:
ihdnaG ecnatsnI roF ygolonhceT

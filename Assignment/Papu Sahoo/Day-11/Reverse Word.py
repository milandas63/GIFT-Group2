"""
Write a program to reverse the charecters of each word in a string 
"""
def reverse_words(input_string):
   words = input_string.split()
  reversed_words = words[::-1]
  reversed_string = " ".join(reversed_words)
    return reversed_string
input_string = "God is Omnipotent and Omniscient"
reversed_string = reverse_words(input_string)
print(reversed_string)

Output:
Omniscient and Omnipotent is God

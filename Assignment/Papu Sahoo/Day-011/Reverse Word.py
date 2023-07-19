//  Write a program to reverse all words in a string //
def reverse_string(input_string):
    return input_string[::-1]

if __name__ == "__main__":
    input_string = "Gandhi Institute For Technology"
    reversed_string = reverse_string(input_string)
    print("Original String:", input_string)
    print("Reversed String:", reversed_string)
    
Output:
Original String: Gandhi Institute For Technology
Reversed String: ygolonhceT roF etutitsnI ihdnaG

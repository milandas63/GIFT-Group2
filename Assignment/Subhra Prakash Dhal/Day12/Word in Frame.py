
""" Write a function that takes a list of strings and prints them, one per line, in a  
         rectangular frame. 
     For example the list ["Hello", "World", "in", "a", "frame"] gets printed as: 
         ********* 
         * Hello * 
         * World * 
         * in    * 
         * a     * 
         * frame * 
         ********* 
 """ 
  
  
 def print_in_frame(strings): 
     max_length = max(len(s) for s in strings) 
     frame_width = max_length + 4  # Add 4 for the two stars and two spaces on each side 
  
     # Print the top frame border 
     print("*" * frame_width) 
  
     # Print each string with padding to align in the frame 
     for s in strings: 
         padding = " " * (max_length - len(s)) 
         print(f"* {s}{padding} *") 
  
     # Print the bottom frame border 
     print("*" * frame_width) 
  
 # Example usage: 
 words = ["Hello", "World", "in", "a", "frame"] 
 print_in_frame(words)
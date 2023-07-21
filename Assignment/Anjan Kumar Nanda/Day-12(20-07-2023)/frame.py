def print_in_frame(strings):
  width = len(max(strings, key=len))
  height = len(strings)
  print('*' * (width + 4))
  for i in range(height):
    print('* {:<{}} *'.format(strings[i], width))
  print('*' * (width + 4))
if _name_ == '_main_':
  strings = ["Hello", "World", "in", "a", "frame"]
  print_in_frame(strings)
  """ 
  OUTPUT :-
         * * * * *
         * Hello * 
         * World * 
         * in    * 
         * a     * 
         * frame * 
         * * * * *
         """

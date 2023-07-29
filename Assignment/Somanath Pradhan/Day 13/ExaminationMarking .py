calculate_grace_marks = lambda aggregate, num_failed_subjects: 10 if aggregate == "pass" and num_failed_subjects == 1 else (8 if aggregate == "pass" and num_failed_subjects == 2 else (6 if aggregate == "pass" and num_failed_subjects == 3 else 0)) 
  
 if __name__ == "__main__": 
     # Test cases 
     print(calculate_grace_marks("pass", 1))  # Output: 10 
     print(calculate_grace_marks("pass", 2))  # Output: 8 
     print(calculate_grace_marks("pass", 3))  # Output: 6 
     print(calculate_grace_marks("fail", 2))  # Output: 0

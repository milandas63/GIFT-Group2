calculate_simple_interest = lambda principal, rate_of_interest, time_in_year: (principal * rate_of_interest * time_in_year) / 100 
  
 if __name__ == "__main__": 
     scenarios = [ 
         {"Year": 3, "Rate": 6.0}, 
         {"Year": 5, "Rate": 5.5}, 
         {"Year": 8, "Rate": 3.5} 
     ] 
  
     principal = 10000 
  
     for scenario in scenarios: 
         simple_interest = calculate_simple_interest(principal, scenario["Rate"], scenario["Year"]) 
         print(f"Principal = {principal}, Year = {scenario['Year']}, Rate = {scenario['Rate']} => Simple Interest = {simple_interest}") 
  
 Output = 
 Principal = 10000, Year = 3, Rate = 6.0 => Simple Interest = 1800.0 
 Principal = 10000, Year = 5, Rate = 5.5 => Simple Interest = 2750.0 
 Principal = 10000, Year = 8, Rate = 3.5 => Simple Interest = 2800.0


/* Solve deep nesting of for loop to generate multiplication tables 
     a)  Print all multiplication tables from 2 to 10? Five tables are supposed to 
         be arranged horizontally and subsequently five more in the next row horizontally 
         and so on. 
  
     Example: 2 to 10 
  
      2 x  1 =   2   3 x  1 =   3   4 x  1 =   4   5 x  1 =   5   6 x  1 =   6 
      2 x  2 =   4   3 x  2 =   6   4 x  2 =   8   5 x  2 =  10   6 x  2 =  12 
      2 x  3 =   6   3 x  3 =   9   4 x  3 =  12   5 x  3 =  15   6 x  3 =  18 
      2 x  4 =   8   3 x  4 =  12   4 x  4 =  16   5 x  4 =  20   6 x  4 =  24 
      2 x  5 =  10   3 x  5 =  15   4 x  5 =  20   5 x  5 =  25   6 x  5 =  30 
      2 x  6 =  12   3 x  6 =  18   4 x  6 =  24   5 x  6 =  30   6 x  6 =  36 
      2 x  7 =  14   3 x  7 =  21   4 x  7 =  28   5 x  7 =  35   6 x  7 =  42 
      2 x  8 =  16   3 x  8 =  24   4 x  8 =  32   5 x  8 =  40   6 x  8 =  48 
      2 x  9 =  18   3 x  9 =  27   4 x  9 =  36   5 x  9 =  45   6 x  9 =  54 
      2 x 10 =  20   3 x 10 =  30   4 x 10 =  40   5 x 10 =  50   6 x 10 =  60 
  
      7 x  1 =   7   8 x  1 =   8   9 x  1 =   9  10 x  1 =  10 
      7 x  2 =  14   8 x  2 =  16   9 x  2 =  18  10 x  2 =  20 
      7 x  3 =  21   8 x  3 =  24   9 x  3 =  27  10 x  3 =  30 
      7 x  4 =  28   8 x  4 =  32   9 x  4 =  36  10 x  4 =  40 
      7 x  5 =  35   8 x  5 =  40   9 x  5 =  45  10 x  5 =  50 
      7 x  6 =  42   8 x  6 =  48   9 x  6 =  54  10 x  6 =  60 
      7 x  7 =  49   8 x  7 =  56   9 x  7 =  63  10 x  7 =  70 
      7 x  8 =  56   8 x  8 =  64   9 x  8 =  72  10 x  8 =  80 
      7 x  9 =  63   8 x  9 =  72   9 x  9 =  81  10 x  9 =  90 
      7 x 10 =  70   8 x 10 =  80   9 x 10 =  90  10 x 10 = 100    */ 
  
  
 public class Tables { 
         public static void main() { 
                 System.out.println("Hello World-2!"); 
  
         } 
  
         public static void main(String[] args) { 
                 int start = 2; 
                 int end = 25; 
  
                 for(int i=2; i<=10; i++) { 
                         for(int j=1; j<=10; j++) { 
                                 System.out.println(i+" x "+j+" = "+(i*j)); 
                         } 
                 } 
  
                 System.out.println("------------------------------------------------"); 
                 for(int h=start; h<=end; h+=5) { 
                         for(int i=1; i<=10; i++) { 
                                 for(int j=h; j<=(h+4); j++) { 
                                         System.out.print(padL(j,2)+" x "+padL(i,2)+" = "+padL((i*j),3)+"  "); 
                                         //System.out.print(j+" x "+i+" = "+(i*j)+"  "); 
                                         if(j>=end) break; 
                                 } 
                                 System.out.println(); 
                         } 
                         System.out.println(); 
                 } 
         } 
  
         public static String padL(int n, int len) { 
                 String retVal = ""+n; 
                 for(int i=retVal.length(); i<len; i++) { 
                         retVal = " "+retVal; 
                 } 
                 return retVal; 
         } 
  
 }10
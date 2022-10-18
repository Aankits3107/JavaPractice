package PrimeNumber;

import java.util.Scanner; 
public class PrimeNumber { 
    public static void main(String args[]) { 
    //print all prime numbers till 'n'//
    int n = 100, count;
    for (int i = 1; i <= n; i++) {
     count = 0;
     for (int j = 2; j <= i / 2; j++) {
      if (i % j == 0) {
       count++;
       break;
      }
     }
     if (count == 0) {
      System.out.println(i);
     }
    }
    
  //user defined number check//
      int num, b, c; 
      Scanner s = new Scanner(System.in); 
        System.out.println("Enter A Number"); 
      num = s.nextInt(); 
      b = 1; 
      c = 0; 
      while(b <= num) { 
        if((num%b) == 0) 
          c = c+1; 
          b++; 
        } 
        s.close();
        if(c == 2) 
          System.out.println(num +" is a prime number"); 
        else 
          System.out.println(num +" is not a prime number"); 
      } 
    
}

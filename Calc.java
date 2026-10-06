import java.util.Scanner;
 public class Calc 
 { 
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in); 
         double principal, rate, amount; int year, time; 
         
         System.out.print("Enter the principal amount: "); 
         principal = scanner.nextDouble(); 
         
         System.out.print("Enter the rate of interest (%): "); 
         rate = scanner.nextDouble() / 100; 
         
         System.out.print("Enter the number of times compounded per year: "); 
         time = scanner.nextInt(); 
         
         System.out.print("Enter the number of years: "); 
         year = scanner.nextInt(); amount = principal * Math.pow(1 + rate / time, time * year); 
         
         System.out.printf("The amount after %d years is: $%.2f%n", year, amount); 
         
         scanner.close(); }
          }
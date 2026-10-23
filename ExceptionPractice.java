import java.util.Scanner;
public class ExceptionPractice {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your First Number"); 
    
       
    
    int a = sc.nextInt();
    
    System.out.println("Enter your Seconde Number");
    int b = sc.nextInt();
try{
    
   int result = a /b;
    System.out.println("Result:" + result);
}
     catch(ArithmeticException e){
    System.out.println("Cannot divide by zero");
       }

sc.close();

}
    
}

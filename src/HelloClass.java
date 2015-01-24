import java.util.Scanner;

public class HelloClass {

public static void main(String[]args)

{

Scanner keyboard = new Scanner(System.in);

System.out.println("Enter your username");

String username = keyboard.next();

System.out.println("Enter your password");

String password = keyboard.next();

System.out.println("Hello " + username + "," + "Welcome to Csc200 Class! and your password is " + password );
keyboard.close();
}
}
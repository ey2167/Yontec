import java.util.Scanner;
/*Elohe Yonas
 * CSC201 
 * Sat 9:00-12:40
 * 
 * 
 */
public class Vending {
	public static void main(String[]args){
		System.out.println("we got CHIPS, BAGELS, PRETZELS, ORANGE JUICE, AND EVEN SANDWHICHES!");
		System.out.println("Vending Machines are the Greatest"); //introducing products and machine
		System.out.println("Insert Money type the amount of money corresponding to the coin, 100 for a dollar, then 500 for 5 dollars. type 0 to finish input ");
Scanner keyboard = new Scanner(System.in);
//insert will act as the placeholder of what the user will type in
//Sum will accumulate according to insert
int insert = 0;
int Sum = 0;
do
{
	insert = keyboard.nextInt();
	/*
	 * the if statement is added in order to prevent irregular objects or
	 * cash from entering the vending machine
	 * the Sum is subtracted in order to nullify the addition
	 */
	if (insert != 10 && insert != 5 && insert != 1 && insert != 25 && insert != 100 && insert != 500 && insert != 0)
	{
		System.out.println("invalid slot, please retry");
		Sum -= insert;
	}
	else
	System.out.println("you have inserted " + insert);
	Sum += insert;
	System.out.println("the sum is " + Sum);
	
}
while(insert != 0);	
if (Sum == 0)
{
	System.out.println("have a desirable day");
	System.exit(0);
}
/*
 * now for the next part, i must make it so that when certain inputs 
 * are pressed, right amount of money is spent.
 */
System.out.println("press 1 for Chips(75c), 2 for pretzels(50c), 3 for sandwhich(175c), 4 for orange juice (65c), and 5 for bagel(115c). press 7 to confirm purchase");
do
{
	insert = keyboard.nextInt();
	if (insert != 1 && insert != 2 && insert != 3 && insert != 4 && insert != 5 && insert != 7)
	{
		//insert = 0 to null input and restart the loop
		insert = 0;
		//message telling user to try again
		System.out.println("invalid input, please try again");
	}
	else if(insert == 1)
	{
		insert = 75;
	}
	else if(insert == 2)
	{
		insert = 50;
	}
	else if(insert == 3)
	{
		insert = 175;
	}
	else if(insert == 4)
	{
		insert = 65;
	}
	else if(insert == 5)
	{
		insert = 115;
	}
	//making sure the customer isn't broke
	if (Sum > 0)
	{
	Sum -= insert;
	
	}
	if (Sum < 0)
	{
		//YOU DON'T HAVE ENOUGH MONEY FOR THIS (also recovering sum from last input)
		Sum += insert;
		System.out.println (" not enough money for that");
		
	}
	if(insert != 7)
	{
	System.out.println("you have " + Sum + " Cents Left");
	}
}
//pressing 7 will escape the loop.
while (insert != 7);
Sum = Sum + 7;
//display the amount of money left
System.out.println("total change is " + Sum + " Cents");

/*
 * the remainders will act as place holders for quarters, dimes, nickels,
 * and pennies so that the right amount of change is displayed.
 */
int quarter = Sum/25;
int dimes = (Sum % 100 % 25)/10;
int nickles = (Sum % 100 % 25 % 10)/5;
int pennies = (Sum % 100 % 25 % 10 % 5);
System.out.println("you have " + quarter + " quarters, " + dimes + " Dimes, " + nickles + " nickles, " + "and " + pennies + " Pennies");		
keyboard.close();
	}

}

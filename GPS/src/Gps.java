import java.util.Scanner;
/*current coordinates are (x,y) where x is effected by East and West and
 * y is affected by North and South
 *the time(minutes)=0 and the initial coordinates are (0,0)
 *input directions North,South,East,West every five minutes with inputs
 *resembling a number pad (8,2,6,4) Respectively
 *when choosing 8: y increases by 5 and minutes increases by 5, y>0
 *when choosing 2: y decreases by 5 and minutes increases by 5, y>0
 *when choosing 6: x increases by 5 and minutes increases by 5, x>0
 *when choosing 4: x decreases by 5 and minutes increases by 5, x>0
 *Coordinates are calculated for every stop at an intersection, so the
 *driver will constantly be informed of his location, and the driver will
 *also tell the gps where he is going by inputing the respective inputs.
 * 
 * once minutes=60, the gps will inform you of your current coordinates 
 * regardless of intersection. that way, even at no intersection, you will
 * know your location.
 */
public class Gps {
	

	public static void main(String[]args){
		//initializing time
int minute = 0;

//variables for possible future patches
int hour = minute/60;
int miles = 0;
//initializing the x and y values at the starting coordinate (x,y)
int x = 0;
int y = 0;

Scanner keyboard = new Scanner(System.in);
do
{
	/*
	 * integers used as inputs due to poor String use and 
	 * the resemblence of directions to the number pad that can resemble the
	 * gps inputs in place of directions
	 */
	System.out.println("Minute" + minute + "/60");
	System.out.println("you are at an intersection. Type 8 North,  2 for South, 6 for East, or 4 for West.");
	System.out.println("you are currently in coordinates (" + x + "," + y + ")");
	int Direction = keyboard.nextInt();
	if(Direction == 8) //going north
	{
		y += 5; //going up by 5
		minute += 5; // time passes
		System.out.println("Going North (5 Minutes/miles Later...)");
	}
	else if(Direction == 2)//going south
	{
		y -= 5; // going down by 5
		minute += 5; //time passes
		if(y<0){
			y += 5; //nullify direction change
			minute -= 5; //nullify time change
			System.out.println("DONT DO IT! YOU'LL CRASH!");//no negative coordinates
		}
		else System.out.println("Going South (5 Minutes/miles Later...)");
	}
	else if(Direction==6) //going east
	{
		x += 5; //going right by 5
		minute += 5; //time passes
		System.out.println("Going East (5 Minutes/miles Later...)");
	}
	else if(Direction==4) //going west
	{
		x -= 5;
		minute += 5;
		
		if(x<0){
			x += 5; //nullify direction change
			minute -= 5; //nullify time change
			System.out.println("DONT DO IT! YOU'LL CRASH!"); //no negative coordinate
		}
		else System.out.println("Going South (5 Minutes/miles Later...)");
	}
	else System.out.println("Invalid input, please retry");//informing of misclicks
}
while(minute != 60);
System.out.println("after one hour, your current position is (" + x + "," + y + "," + ")");
keyboard.close();
	}
}

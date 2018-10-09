import java.util.Scanner;


public class labnum2areaperimeter {


	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in); //input
		
		double length = 24.5; //user input of length of room
		double width = 20; //user input of width of room
		double area = width * length; //area of room
		double perimeter = 2*(length + width); //perimeter of room
		 
		

		System.out.println("Enter length: "); //input prompt for length
		length = scnr.nextDouble(); 
		
		System.out.println("Enter width: "); //input prompt for width
		width = scnr.nextDouble();
		
	    System.out.println("area: " + width * length);
	    System.out.println("perimeter: " + 2*(length + width));
	    	    
	    
	    }
}
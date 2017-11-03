package typecastingvariables;//created package as typecatingvariables
import java.util.Scanner;//import scanner class is in util folder inside the java folder
//util contains utility classes
//scanner is a predefined class for taking inputs from user

public class TypeCasting {//created class as TypeCasting

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we uses scanner here because we have tto take the input from the user
		Scanner in  = new Scanner(System.in);
		//here we take the first input from the user
		System.out.println("Input first number: ");  
	    byte num1 = in.nextByte();
	    //here we take the first input from the user
	    System.out.println("Input Second number: ");  
	    short num2 = in.nextShort();
	    //we can take initialy byte and short type of variable
	    byte x = num1;
	    short y = num2;
	    int z=0;
	    long u=0;
	    float v=0;
	    double d=0;
            //here we are doing typecastig we put value of byte and short in int
	     z=x+y;
	    System.out.println("Sum of byte and short:" +z);
		//here we put value of short and int in long
	    u=y+z;
	    System.out.println("Sum of short and int:" +u);
		//here we put value of int and long in float
	    v=z+u;
	    System.out.println("Sum of int and long:" +v);
		//here we put value of long and float in double
	    d=v+u;
	    System.out.println("Sum of float and double:" +d);
	    
	     }

}

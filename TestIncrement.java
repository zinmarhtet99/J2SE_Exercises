package Exercise;

public class TestIncrement {

	public static void main(String[] args) {
			
			int i,iInc; //declare variables
			
			i = 5; // assign number 
			
			iInc = i++; //increment 1 after operation
			
			System.out.println("The value of iInc is "+ iInc + " and the value of i is "+ i); // output the value of iInc is 5 and the value of i is 6
			
			i = 5;
			
			iInc = ++i;  // increment 1 before operation
			
			System.out.println("The value of iInc is "+ iInc + " and the value of i is "+ i); // output the value of iInc is 6 and the value of i is 6
			
			
	
	}
}
/* here i am showing  to convert an int variable to String using inbuilt function of string class */


package Assignment13;

public class StringExample { 
	// here i am creating class name as StringExample
	
	public static void main (String []args){ // here i am declared int variable as myInteger
		
		int myInteger=20;    // here i have initialized an integer variable of value 20
		String src= "";       // its an empty String 
	src=Integer.toString(myInteger);  //it stores the value of integer variable to string 
	 
		
		System.out.println("converting the interger to string varibale" +src); //it gives the output string as 20
	
	}

}

package JavaStreamsandLambda;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;


public class StreamExample {

	public static void main(String[] args) {
		
		// Compared a string and print 

		// Define Array list in using stream
		
		Long z=Stream.of("Abhijeet","Njay","Bmit","Dnuj").filter(F->
		{
			F.startsWith("B");
			return true;
		}).count();
		System.out.println(z);
		
	}
}
		
		
	

package JavaStreamsandLambda;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

@Test 
public class StringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ajay");
		names.add("Amit");
		names.add("Anu");
		names.add("Crti");
		names.add("Dnuj");
		names.add("Aru");
		names.add("Abhinav");
		names.add("Anju");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String Actual=names.get(i);
		//System.out.println(ActualNames);
		if(Actual.startsWith("A"));
		{
			count++;
		}
		}
	System.out.println(count);
	}

@Test
public void streamFilter()
{
	Long E=Stream.of("Ambit","Pintu", "Sanjay", "Danjay","Chiku").filter(F->F.startsWith("San")).count();
			
	//Long E= names.stream().filter(d->d.startsWith("B")).count();
	System.out.println(E);
}

}

	

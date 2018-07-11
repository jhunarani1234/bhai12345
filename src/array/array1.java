package array;
import java.util.*;

 public class array1{
	public static void main(String args[])
	{
	ArrayList<String> list=new ArrayList<String>();
	list.add("Rabi");
	list.add("Vijay");
	list.add("Rabi");
	list.add("Vijay");
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
System.out.println(itr.next());
	}
}
}
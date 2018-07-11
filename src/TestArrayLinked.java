import java .util.*;
public class TestArrayLinked 
{
	public static void main (String args[])
	{
	List<String> al=new ArrayList<String>();
	al.add("Rabi");
	al.add("Vijay");
	al.add("Rabi");
	al.add("Vijay");
	List<String> al2=new LinkedList<String>();
	al2.add("James");
	al2.add("Serana");
	al2.add("Shruti");
	al2.add("Sonud");
	System.out.println("arraylist:" +al);
	System.out.println("linkedlist:" +al2);

}
}

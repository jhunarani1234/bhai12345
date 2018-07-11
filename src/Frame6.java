import java.util.*;

public class Frame6 {
	int i=0;
	static int val=100;
	
	public void test() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100,"amit");
		hm.put(101, "akil");
	hm.put(101,"vijay");
	hm.put(102,"rahul");
	for(Map.Entry m:hm.entrySet())
	{  
		   System.out.println(m.getKey()+" "+m.getValue());  }  
		 }
	

public static void main(String args[])
	{
		
//	Frame6 obj=new Frame6();
//	obj.test();
	}
	}
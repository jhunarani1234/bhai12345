package Oops;

 class Student2 
{
	int id;
	String name;
}

class Student3 
{
	public static void main(String args[])
	{
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		s1.id = 101;
		s1.name = "jhuna";
		s2.id = 102;
		s2.name = "amit";
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
	}

}

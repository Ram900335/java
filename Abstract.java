abstract class Abstract
{
	public String fname="gowri";
	public int age=12;
	public abstract void study();
}
// Subclass (inherit from abstrac)
class Student extends Abstract
{
	public int graduationYear=2018;
	public void study();//the body of the abstract method is
	 System.out.println("he study all day");
}
// end code from filename:Abstract.java
//code from filename
class MyClass
{
	public static void main(String[] args)
	{
		Student myobj=new Student();
		System.out.println("Name:"+myobj.fname);
		System.out.println("age:"+myobj.age);
		System.out.println("graduation Year:"+myobj.graduationYear);
		myobj.study();//call abstract method
	}
}

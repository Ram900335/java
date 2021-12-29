//constructor overloading 
class Student
{
	public Student()   // 1 default constructor
	{
		System.out.println("Hello");
	}

	public Student(String name)   //2 parameterized constructor with single parameter
	{
		System.out.println("Student Name is" + name);
	}

	public Student(String name, int marks)   //3 parameterized constrctor with two parameters
	{
		System.out.println("Student name is " + name + "and marks are " + marks);
	}

	public static void main(String[] args)
	{
		Student std1 = new Student();  //calls 1
		Student std2 = new Student("M.GOWRI SHAMKAR"); //calls2
		Student std3 = new Student("M.GOWRI SHANKAR",100); //calls3
	}
}

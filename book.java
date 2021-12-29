class book
{
	String bookname;
	String authorname;
	String publisher;
	int price;
	
	public void store(String tbookname,String tauthorname,String tpublisher,int tprice)
	{
		bookname=tbookname;
		authorname=tauthorname;
		publisher=tpublisher;
		price=tprice;
	}
	
	public void display()
	{
		System.out.println("bookname:" + bookname);
		System.out.println("authorname:" + authorname);
		System.out.println("publisher:" + publisher);
		System.out.println("price:" + price);
		System.out.println("---------------------");
		
	}
	
	public static void main(String arg[])
	{
		book java = new book();
		book oracle = new book();
		
		java.store("java language","packianathan","anuragha",333);
		oracle.store("oracle Database","packianathan","anuragham",333);
		
		java.display();
		oracle.display();
	}
}

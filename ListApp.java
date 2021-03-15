
public class ListApp 
{
	public static void main(String [] args)
	{
		FirstList<String> stringList = new FirstList<String>();
		FirstList<Square> squareList = new FirstList<Square>();
		
		stringList.addItem("a");
		stringList.addItem("ab");
		stringList.addItem("abc");
		stringList.addItem("abcd");
		stringList.addItem("abcde");
		
		for(int i = 0; i < stringList.getSize(); i++)
			System.out.println(stringList.getItem(i));
		
		squareList.addItem(new Square(3, 4, 5));
		
		for(int i = 0; i < squareList.getSize(); i++)
			System.out.println(squareList.getItem(i).toString());
	}
}

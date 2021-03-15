
/*** The FirstList class implements a generic array.
*@author  Nathan Johnson
* @version 1.0
* @since   2021-03-07 
*/

public class FirstList<T>
{    

	private final int DEFAULT_SIZE=10;
    private int currentItem=0;
    private T arList[]; 
    
  	@SuppressWarnings("unchecked")
    public FirstList()
    {        
  		// arList=new T[DEFAULT_SIZE];   //causes a compile error                                     				   		// because T is cast to object                                        				  	 // later if we cast object to whatever T is,
  		// say a string,
        // we have a runtime error
  		// We could use a java collection like ArrayList for this.                                                                                             		
  		arList=(T[]) new Object[DEFAULT_SIZE];
    } 

	@SuppressWarnings("unchecked")
	public FirstList(int length)
	{
		// arList=new T[length]; //causes a compile error
		arList=(T[]) new Object[length];
    }

	//Student writes a setter called addItem    
	//Write code to add an item to the end of the array 
	public void addItem(T item)
	{
		arList[currentItem] = item;
		currentItem++;
	}
	
	//Getter
	public T getItem(int position)
	{
		if(position < arList.length)
			return arList[position];
		else
			return null;
	}
	
	public T[] getItem()
	{
		return arList;
	}
	
	public int getSize()
	{
		//return arList.length;
		return currentItem;
	}
	
}

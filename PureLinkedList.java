
/**
 * This is a linked list data structure.
 * @author ajshippee, rncostanzo
 * @param 
 */
public class PureLinkedList<E>{
	
	//The value of the node
	private E value;
	
	//The tail of the node
	private PureLinkedList<E> tail;
	
	/**
	 * This is the constructor
	 * @param value the item to be assigned to the value of the node
	 */
	public PureLinkedList(E value){
		this.value = value;
		this.tail = null;
	}
	
	/**
	 * This returns the string of the linked list
	 * @return the string of the linked list
	 */
	public String toString(){
		if(this.tail == null){
			String listString = (String) value;
			return listString;
		}
		else{
			String listString = (String) value;
			return listString + this.toString();
		}
	}
	/**
	 * This is the unit test
	 */
	public static void main(String args[]){
		PureLinkedList<String> ll1 = new PureLinkedList<String>("Hello");
		
		System.out.print(ll1);
	}
}

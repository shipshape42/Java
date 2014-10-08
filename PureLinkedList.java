
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
		String listString = "";
		if(tail != null){
			listString = this.tail.toString();
		}
		return this.value + " " + listString;
		/*if(this.tail == null){
			String listString = (String) value;
			return listString;
		}
		else{
			String listString = (String) value;
			return listString + this.toString();
		}*/
	}
	/**
	 * This adds an element to the end of the list
	 * @param item, adds to the end of list
	 */
	public void add(E item){
		if(this.tail == null){
			this.tail = new PureLinkedList<E>(item);
		}
		else{
			this.tail.add(item);
		}
	}
	/**
	 * This method determines if said value is the last entry in the list.
	 * @param item, the value that is trying to be found in the last position.
	 * @return true if item is in the last position, false if not.
	 */
	public boolean isLast(E item){
		if(this.tail != null){
			return this.tail.isLast(item);
		}
		else if(this.tail == null){
			if(this.value == item){
				return true;
			}
			return false;
		}
		return false;
	}
	/**
	 * This returns the first item of the linked list.
	 * @return the first element of the linked list.
	 */
	public E getFirst(){
		return this.value;
	}
	/**
	 * This sets the first element of the list
	 * @param The item to replace the first element
	 */
	public void setFirst(E item){
		this.value = item;
	}
	public E getTail(){
		if(this.tail != null){
			return this.tail.getTail();
		}
		return this.value;
	}
	/**
	 * This takes in a linked list, and sets the last element of this list to the others last
	 * @param the other linked list whose last element will replace this lists element
	 * @param the last element of the other list
	 */
	public void setTail(PureLinkedList<E> list){
		E item = list.getTail();
		if(this.tail != null){
			this.tail.setTail(list);
		}
		else{
			this.value = item;
		}
	}
	/**
	 * This returns the length of the linked list
	 * @param count the integer representing the size of the list.
	 */
	public int length(){
		if(this.tail != null){
			int count = this.tail.length();
			return 1 + count;
		}
		else{
			return 1;
		}
	}
	/**
	 * This is the unit test
	 */
	public static void main(String args[]){
		PureLinkedList<String> ll1 = new PureLinkedList<String>("Hello");
		PureLinkedList<String> ll2 = new PureLinkedList<String>("pies");
		
		ll2.add("cakes");
		
		ll1.add("tools");
		ll1.add("moose");
		
		System.out.println("The List: " + ll1);
		
		System.out.println("Is moose last ? " + ll1.isLast("moose"));
		
		System.out.println("Is Hello last? " +ll1.isLast("Hello"));
		
		System.out.println("First Element: " + ll1.getFirst());
		
		ll1.setFirst("First");
		
		System.out.println("The List: " + ll1);
		
		System.out.println("Last Element: " + ll1.getTail());
		
		ll1.setTail(ll2);
		
		System.out.println("The List: " + ll1);
		System.out.println("The Length: " + ll1.length());
	}
}



public class DLList {
	static Node Head;
	public class Node{
		int data;
		Node prev;
		Node next;	
		Node(int d){
			this.data=d;
			prev=null;
			next=null;
		}
		Node(){
			this.data=0;
			prev=null;
			next=null;
		}
	}
	public void Insert(int data) {
		Node new_node=new Node(data);
		new_node.next=Head;
		new_node.prev=null;
		if(Head!=null) {
			Head.prev=new_node;
		}
		Head=new_node;
	}
	void append(int new_data) 
    { 
  
        Node new_node = new Node(new_data); 
  
        Node last = Head;
  
      
        new_node.next = null; 
  
      
        if (Head == null) { 
            new_node.prev = null; 
            Head = new_node; 
            return; 
        }
        while (last.next != null) 
            last = last.next; 
  
        last.next = new_node; 
  
        new_node.prev = last; 
    } 
  
	public void InsertPos(int pos,int data) {
		Node new_node=new Node(data);	
		Node cur=Head;
		int i;
		Node Back=null;
		/*do {
			Back=cur;
			cur=cur.next;
			i++;
			
		}while(i<pos&& cur.next!=null);*/
		for(i=1;i<pos && cur.next!=null ;i++) {
			cur=cur.next;
		}
		new_node.next=cur.next;
		new_node.prev=cur;
		cur.next.prev=new_node;	
		cur.next=new_node;
	}
	//Inserting after  given Node
	 public void InsertAfter(Node prev_Node, int new_data) 
	    { 
	  
	        if (prev_Node == null) { 
	            System.out.println("The given previous node cannot be NULL "); 
	            return; 
	        } 
	  
	       
	        Node new_node = new Node(new_data); 
	  
	        new_node.next = prev_Node.next; 
	  
	        prev_Node.next = new_node; 
	  
	        new_node.prev = prev_Node; 
	  
	        if (new_node.next != null) 
	            new_node.next.prev = new_node; 
	    } 
	 //Delete a Node from the given Linked list
	 void deleteNode(Node head_ref, Node del) { 
		  
	        /* base case */
	        if (Head == null || del == null) { 
	            return; 
	        } 
	  
	        /* If node to be deleted is head node */
	        if (Head == del) { 
	            Head = del.next; 
	        } 
	  
	        /* Change next only if node to be deleted is NOT the last node */
	        if (del.next != null) { 
	            del.next.prev = del.prev; 
	        } 
	  
	        /* Change prev only if node to be deleted is NOT the first node */
	        if (del.prev != null) { 
	            del.prev.next = del.next; 
	        } 
	  
	        /* Finally, free the memory occupied by del*/
	        return; 
	    } 
	  
	  
	//Printing the data in the Entered Doubly Linked List 
	public void print() {
		Node Temp=Head;
		while(Temp!=null) {
			System.out.print(Temp.data+" ");
			Temp=Temp.next;
		}
		System.out.println("");
		
		
	}
}

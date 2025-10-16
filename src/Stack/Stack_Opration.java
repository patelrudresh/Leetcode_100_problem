package Stack;

class  Stack_Opration{
	public static Node head;
	
	public static boolean isEmpty() {
		return head==null;
	}
	
	public static void push(int data) {
		Node newnode=new Node(data);
		if(isEmpty()) {
		head=newnode;
			 return;
		}
		newnode.next=head;
		head=newnode;
	}
	
	public static int  peek() {
		if(isEmpty()) {
			return -1;
		}
		return head.data;
	}
	
	public static int pop() {
		if(isEmpty()) {
			System.out.println("stack is emprty");
			return -1;
		}
		int top=head.data;
		head=head.next;
		return top;
	}
	public static void main (String[] args) {
		    push(4);
	        push(5);
	        push(6);
          while(head!=null) {
            System.out.println(peek());
            pop();
          }
	        
		
	}
}
package Queue;

public class CircularQueueArray {
	static int arr[];
	static int size;
	static int rear=-1;
	static int front=-1;
	CircularQueueArray(int n){
		arr= new int[n];
		size=n;
	}
	 public static boolean isEmplty() {
			  return front==-1&&rear==-1;
	 }
	 public static boolean is_full() {
		 
		 return (rear+1)%size==front;
	 }
	 public void add(int data) {
		if(is_full()) {
			return;
		} 
		rear=(rear+1)%size;
		arr[rear]=data;
		if(front==-1) {
			front=0;
		}
	 } 
	 public int remove() {
		 if(isEmplty()) {
			 return -1;
		 }
		int result=arr[front];
		if (rear==front) {
			rear=front=-1;
		}else {
			front=(front+1)%size;
		}
		return result;
	 }
	 public int peek() {
		 if(isEmplty()) {
			 return -1;
		 }
		 return arr[front];
	 }
	 public static void main(String[] args) {
		 CircularQueueArray q=new CircularQueueArray(5);
		 q.add(1);
		 q.add(2);
		 q.add(3);
		 q.add(4);
		 
//		System.out.println(q.peek());
//		System.out.println(q.remove());
//		System.out.println(q.peek());
 q.add(5);;
//		System.out.println(q.peek());
		
		while(!isEmplty()) {
			System.out.println(q.peek());
			q.remove();
		}
	 }
}

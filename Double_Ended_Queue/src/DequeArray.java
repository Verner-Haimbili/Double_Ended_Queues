import java.util.EmptyStackException;

public class DequeArray<E> implements Deque<E> {

		//instance variables
	    private E[] queArray;   //array data storage structure
	    private int front;      //keeps track of front element
	    private int rear;       //keeps track of rear element
	    private int maxSize;    //maximum capacity of array
	    int nElems;            //keeps track of the number of elements currently in the queue
	
	    //constructor
	    @SuppressWarnings("unchecked") //Java doesn't allow creating an array of a generic type directly.
	    public DequeArray(int capacity) {
	        maxSize = capacity;
	        queArray = (E[]) new Object[maxSize];
	        front = -1;
	        rear = -1;
	        nElems = 0;
	    }
	
	    @Override
	    public int size() {
	        return nElems;
	    }
	
	    @Override
	    public boolean isEmpty() {
	    	if((front == -1 && rear == -1) || nElems == 0) {
	    		return true;
	    	}
	        return false;
	    }
	
	    public boolean isFull() {
	    	if((front == 0 && rear == maxSize-1) || front == (rear + 1)) {
	    		return true;
	    	}
	        return false;
	    }
	
	    @Override
	    public E first() {
	        if (isEmpty()) {
	        	throw new EmptyStackException();
	        }     
	        return queArray[front];
	    }
	
	    @Override
	    public E last() {
	    	
	        if (isEmpty()) {
	        	throw new EmptyStackException();
	        }      
	        return queArray[rear];
	    }
	
	    @Override
	    public void addFirst(E item) {
	    	
	       if (isFull()) {
	            throw new IllegalStateException("Deque is full...\n");
	       }
	       else if(isEmpty()) {
	    	   front = 0; rear = 0;
	       }
	       else if (front == 0) {
		       front = maxSize - 1;
	       } 
	       else {
	           front--;
	        }
	       queArray[front] = item;
	       nElems++;
	    }
	
	    @Override
	    public void addLast(E item) {
	    	
	        if (isFull()) {
	            throw new IllegalStateException("Deque is full...\n");
	        }
	        else if(isEmpty()) {
	        	front = 0; rear = 0;
	        }
	        else if (rear == maxSize - 1) {
	            rear = 0;
	        } 
	        else {
	            rear++;
	        }    
	        queArray[rear] = item;
	        nElems++;
	    }
	
	    @Override
	    public E removeFirst() {
	    	
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        
	        E item = queArray[front];
	        if (front == maxSize - 1) {
	            front = 0;
	        } 
	        else{
	            front++;
	        }
	        nElems--;
	        return item;
	   }
	
	    @Override
	    public E removeLast() {
	       if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        E item = queArray[rear];
	        if (rear == 0 && item != null) {
	            rear = maxSize - 1;
	        } 
	        else{
	            rear--;
	        }
	        nElems--;
	        return item;
	    }  
	    
	    public void displayQueue() {
	    	
	    	int index = front;
	    	while(index != rear) {
	    		System.out.println(queArray[index]);
	    		index = (index + 1) % maxSize;
	    	}
	    	System.out.println(queArray[rear]);
	    }
}


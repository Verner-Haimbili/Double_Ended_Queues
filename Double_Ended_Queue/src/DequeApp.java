
public class DequeApp {

	public static void main(String[] args) {
		
		DequeArray<Integer> da = new DequeArray<Integer>(2);

		try {			
			da.addFirst(20);
	        da.addFirst(10);
	        da.addLast(30);
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		System.out.println("\nDisplaying Queue elements: ");
	    da.displayQueue();
		System.out.println();
	        
		try {       
			System.out.println("Removing: " + da.removeFirst());
    		System.out.println("Removing: " + da.removeLast());
    		System.out.println("Removing: " + da.removeFirst());
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}

        DequeArray<String> sa = new DequeArray<String>(10);
        try {
            sa.addFirst("Alina");
            sa.addFirst("Ezekiel");
            sa.addLast("Tangi");
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
        
        System.out.println("\n\nDisplaying Queue elements: ");      
        sa.displayQueue();
        System.out.println();
        
        try {
        	 System.out.println("Removing: " + sa.removeFirst());
             System.out.println("Removing: " + sa.removeLast());
             System.out.println("Removing: " + sa.removeFirst());
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}   
	}
}

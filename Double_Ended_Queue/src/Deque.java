
public interface Deque<E> {

	/** @return the number of elements in the deque. */
	public int size( );
	/** @return true when the deque is empty. */
	public boolean isEmpty( );
	/** @return but does not remove, the first element of the deque (null if empty). */
	public E first( );
	/** @return but does not remove, the last element of the deque (null if empty). */
	public E last( );
	/** @param e the element to be inserted at the front of the deque. */
	public void addFirst(E item);
	/** @param e the element to be inserted at the back of the deque. */
	public void addLast(E item);
	/** @return E the first element of the deque (null if empty). */
	public E removeFirst( );
	/** @return E the last element of the deque (null if empty). */
	public E removeLast( );
}

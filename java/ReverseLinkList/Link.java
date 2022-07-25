public class Link<T> {

	public T data;
	public Link<T> next;
	
	public Link(T data) {
		this.data = data;
		next = null;
	}
}

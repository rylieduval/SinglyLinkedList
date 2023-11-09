package pack;

public class myNode<T> {
	public T Data;
	public myNode<T> NextNode;
	
	public myNode(T data)
	{
		this.Data = data; 
		this.NextNode = null;
	}
}

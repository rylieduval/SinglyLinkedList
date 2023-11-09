package pack;

public class theSinglyLinkedList<T> implements List<T>
{
	myNode<T> Head;
	myNode<T> Tail;
	int Size; 
	
	public theSinglyLinkedList()
	{
		this.Head = null; 
		this.Size = 0; 
	}
	
	@Override
    public void append(T item) {
        myNode<T> newNode = new myNode<>(item);

        if (Head == null) {
            Head = newNode;
            return;
        }

        myNode<T> current = Head;
        while (current.NextNode != null) {
            current = current.NextNode;
        }

        current.NextNode = newNode;
    }

    @Override
    public void prepend(T item) {
        myNode<T> newNode = new myNode<>(item);
        newNode.NextNode = Head;
        Head = newNode;
    }

    @Override
    public void insertAfter(T existingItem, T newItem) {
        myNode<T> newNode = new myNode<>(newItem);
        myNode<T> current = Head;

        while (current != null) {
            if (current.Data.equals(existingItem)) {
                newNode.NextNode = current.NextNode;
                current.NextNode = newNode;
                return;
            }
            current = current.NextNode;
        }
    }

    @Override
    public void remove(T item) {
        if (Head == null) {
            return;
        }

        if (Head.Data.equals(item)) {
            Head = Head.NextNode;
            return;
        }

        myNode<T> current = Head;
        while (current.NextNode != null) {
            if (current.NextNode.Data.equals(item)) {
                current.NextNode = current.NextNode.NextNode;
                return;
            }
            current = current.NextNode;
        }
    }

    @Override
    public boolean search(T item) {
        myNode<T> current = Head;

        while (current != null) {
            if (current.Data.equals(item)) {
                return true;
            }
            current = current.NextNode;
        }

        return false;
    }

    @Override
    public void print() {
        myNode<T> current = Head;

        while (current != null) {
            System.out.print(current.Data + " ");
            current = current.NextNode;
        }
        System.out.println();
    }

    @Override
    public void printReverse() {
        printReverse(Head);
        System.out.println();
    }

    private void printReverse(myNode<T> node) {
        if (node == null) {
            return;
        }

        printReverse(node.NextNode);
        System.out.print(node.Data + " ");
    }

    @Override
    public void sort() {
    	if (Head == null || Head.NextNode == null) {
            return;
        }

        myNode<T> sorted = null;
        myNode<T> current = Head;

        while (current != null) {
            myNode<T> next = current.NextNode;

            if (sorted == null || ((Comparable<T>) current.Data).compareTo(sorted.Data) < 0) {
                current.NextNode = sorted;
                sorted = current;
            } else {
                myNode<T> temp = sorted;

                while (temp.NextNode != null && ((Comparable<T>) temp.NextNode.Data).compareTo(current.Data) < 0) {
                    temp = temp.NextNode;
                }

                current.NextNode = temp.NextNode;
                temp.NextNode = current;
            }

            current = next;
        }

        Head = sorted;
    }

    @Override
    public boolean isEmpty() {
        if (Head == null)
        {
        	return true;
        }
        
        return false;
    }

    @Override
    public int getLength() {
        int length = 0;
        myNode<T> current = Head;

        while (current != null) {
            length++;
            current = current.NextNode;
        }

        return length;
    }

}

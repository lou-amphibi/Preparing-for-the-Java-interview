package support;

public class Node2 {
	private int data;
    private Node2 next;
    
    public Node2(int data, Node2 next) {
    	this.data=data;
    	this.next=next;
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }
}

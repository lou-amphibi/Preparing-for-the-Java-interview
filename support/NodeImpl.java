package support;

public class NodeImpl implements Node{
	public final int value;
	Node next;
	
	public NodeImpl(int n) {
		value=n;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node next) {
		NodeImpl temp=this;
		while (temp.next!=null) {
			temp=(NodeImpl) temp.getNext();
		}
		temp.next=next;
		
	}

	
}



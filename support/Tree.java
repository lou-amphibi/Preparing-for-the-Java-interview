package support;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Tree implements Iterable<Tree>{
	 private int value;
	 private Tree left;
	 private Tree right;
	 private Tree parent=null;
	 
	public Tree(int value, Tree left, Tree right) {
		this.value=value;
		this.left=left;
		this.right=right;
	}
	
	public int getValue() {
		return value;
	}
	
	public Tree getLeft() {
	    return left;
	}

	public void setLeft(Tree left) {
	    this.left = left;
	}

	public Tree getRight() {
	     return right;
	}

	public void setRight(Tree right) {
	    this.right = right;
	}
	
	public void setParent(Tree parent) {
		this.parent = parent;
	}
	
	public Tree getParent() {
		return this.parent;
	}
	@Override
	public Iterator<Tree> iterator(){
		return new TreeIterator(this);
	}

	private class TreeIterator implements Iterator<Tree> {
	    private final Tree root;
	    int size=0;
	    List<Tree> nodes = new ArrayList<>();
	    
	    public TreeIterator(Tree root) {
	        this.root = root;
	        fillInNodes(root);	        
	    }  

	    @Override
	    public boolean hasNext() {
	    	
	        return size<nodes.size();
	    }

	    @Override
	    public Tree next() {
	    	return nodes.get(size++);
	    }
	    
	    private void fillInNodes(Tree current) {
	    	if (current!=null) {
	    		fillInNodes(current.getLeft());
	    		nodes.add(current);
	    		fillInNodes(current.getRight());
	    	}
	    }
	    
	}
}

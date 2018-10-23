public class Node {
    private int value;
    private Node previous;
    private Node next;
	
	// making changes

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
        
}


public class DLinkedList {
    private Node head, tail;
    private Node n,c, r, br, Nr;

    public DLinkedList() {
        Head = null;        
    }
    
    public void insertNode(int v, char l){
        if(Head == null){
            Head = new Node();
            Head.setValue(v);
            Head.setNext(null);
            Head.setPrevious(null);
        }
        if(Head !=null){
            n = new Node();
            n.setValue(v);
            if(l=='B'){
                n.setPrevious(null);
                n.setNext(Head);
                Head.setPrevious(n);
                Head = n;
            }
            if(l== 'E'){
               
                c = Head;
                while(c.getNext()!=null){
                    c = c.getNext();
                }
                c.setNext(n);
                n.setPrevious(c);
                n.setNext(null);
            }
        }
    }
    
    public void printList(DLinkedList myList){
        
        myList = null;
        n = Head;
        while(n.getNext()!=null){
            System.out.println(n.getValue());
            n= n.getNext();
        }
    }
    
    public boolean searchList(int i){
        n = Head;
        while(n.getNext()!=null){
            if(n.getValue()==i){
                return true;
            }
            n = n.getNext();
        }
        
        
        return false;
        
    }

    public boolean IsEmpty(DLinkedList myList){
        return true;
    }
    
    public Node removeNode(int v){
        r= Head;
        br= r;
        while(r.getNext()!=null){
            if(r.getValue()==v){
                Nr = r.getNext();
                br.setNext(Nr);
                Nr.setPrevious(br);
                r.setNext(null);
                r.setPrevious(null);
                return r;
            }
            br = r;
            r= r.getNext();
        }
        return null;
    }
    
    public static void main(String []args){
        DLinkedList  mylist = new DLinkedList();
        mylist.insertNode(5,'B');
        mylist.insertNode(7,'B');
        mylist.insertNode(9,'B');
        mylist.insertNode(10,'B');
        mylist.printList(mylist);
        System.out.println("----------------");
        mylist.removeNode(10);
        mylist.printList(mylist);

        System.out.println("----------------");
        DLinkedList  mylist2 = new DLinkedList();
        mylist2.insertNode(5,'B');
        mylist2.printList(mylist);
        System.out.println(mylist2.searchList(4));
		        
    }
    
}

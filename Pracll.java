public class Pracll{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this .next=null;
        }
    }
     public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
   
    public void add(int idx,int data){
        Node newnode=new Node(data);
        if(head==null){
            addfirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        size++;
        temp.next=newnode;

    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-");
            temp=temp.next;
        }System.out.println(" null");
    }

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next; 
        }
        head=prev;
    }
public static void main(String[] args) {
    Pracll ll=new Pracll();
    ll.print();
     ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.addlast(5);
        ll.add(2, 3);
        ll.print();
        ll.reverse();
        ll.print();
}
} 
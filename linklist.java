public class Linklist{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }// add first
        public static Node head;
        public static Node tail;
        public void addfirst(int data){
            Node nw=new Node(data);
            if(head==null){
                head=tail=nw;
                return;
            }
            nw.next=head;
            head=nw;
        }
        //addlast
        public void addlast(int data){
            Node nw=new Node(data);
                if(head==null){
                    head=tail=nw;
                    return;
                }
                tail.next=nw;
                tail=nw;
        }
        public void print(){
            if(head==null){
                System.out.println(" ll is empty");
                return;
            }
            while(head != null){
            Node temp=head;
            System.out.println(head.data);
            temp=temp.next;
        }   }
    
    public static void main(String[] args) {
        Linklist ll=new Linklist();
        ll.print();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();
    }
}
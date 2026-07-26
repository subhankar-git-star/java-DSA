public class Linklist{
    // creating node function
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
        public static int size;
        public void addfirst(int data){
            Node nw=new Node(data);
            size++;
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
            size++;
                if(head==null){
                    head=tail=nw;
                    return;
                }
                tail.next=nw;
                tail=nw;
        }// print
        public void print(){
            if(head==null){
                System.out.print(" ll is empty");
                return;
            }System.out.println("");
            Node temp=head;
            while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            System.out.print("");
        }   }
     // add in index
     public void add(int data ,int index){
        if(index==0){
            addfirst(data);
            return;
        }
        Node nw=new Node(data);
        size++;
        int i=0;
        Node temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        nw.next=temp.next;
        temp.next=nw;
     }
     // remove fist in ll
     public int removefirat(){
        if(size==0){
            System.out.println("impossible");
            return -1;
        }else if(size==1){
            int data=head.data;
            head=tail=null;
            size=0;
            return data;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
     }
     // remove last in ll
    //  public int removelast(){
    //     if(size==0){
    //         System.out.println("impossible");
    //         return -1;
    //     }else if(size==1){
    //         int data=head.data;
    //         head=tail=null;
    //         size=0;
    //         return data;
    //     }
    //     Node temp=head;
    //     for(int i=0;i<size-2;i++){
    //         temp=temp.next;
    //     }
    //     int val=temp.next.data;
    //     tail.next=null;

    //  }   
     public int search(int target){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data!=target){
                i++;
                temp=temp.next;
            }else{
                return i;
            }
        }
        return -1;
     }  
     // reverse a linklist
     public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
     }
    public static void main(String[] args) {
        Linklist ll=new Linklist();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.add(6, 2);
        ll.print();
        System.out.println(ll.search(2));
    }
}

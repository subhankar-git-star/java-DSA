public class StackL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isempty(){
            return head==null;
        }
        // push
        public static void push(int data){
            Node newnNode=new Node(data);
            if(isempty()){
                newnNode=head;
                return;
            }
            
        }
    }
    public static void main(String[] args) {
        
    }
}

import java.util.Stack;

public class Stackcol1{
    public static void print(Stack<Integer> s){
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
}

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static String reverseString(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void revesestack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revesestack(s);
        pushAtBottom(s, top);
        
    }
    public static void main(String[] args) {
        int arr[]={4,3,7,2,1,4};
        Stack<Integer>s=new Stack<>();
        int nextgrater[] =new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgrater[i]=-1;
            }else{
                nextgrater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextgrater.length;i++){
            System.out.println(nextgrater[i]);  
        }
    }
}
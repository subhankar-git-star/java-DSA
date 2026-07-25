import java.util.*;
public class Stackcol2{
    public static boolean parenthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' ||str.charAt(i)=='{' || str.charAt(i)=='['){
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='(' && str.charAt(i)==')'||
               s.peek()=='{' && str.charAt(i)=='}'||
                s.peek()=='[' && str.charAt(i)==']'){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    // duplicate parenthesis
    public static boolean duplicateparenthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                int count=0;
                while(s.pop() != ')'){
                   count++;
                }
                if(count<1){
                    return false;
                }else{
                    s.push(ch);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="{({[]}))";
        System.out.println(parenthesis(str));
    }
}
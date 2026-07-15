import java.util.Scanner;
public class string{
    public static void pallindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("this is not a pallindrome");
            }
        }   
    }

    public static float shortestpath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
             else if(str.charAt(i)=='W'){
                x--;
            }
            else{
                y--;
            }
        }
        int xsq=x*x;
        int ysq=y*y;
        float displacement=(float)Math.sqrt(xsq+ysq);
        return displacement;
    }

    public static String substring(String str,int si,int ei){
        String substring="";
        for(int i=si;i<ei;i++){
            substring+=str.charAt(i);
        }
        return substring;
    }

    public static String uppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String name;
        name=sc.nextLine();
        System.out.println("enter si and ei");
        int si,ei;
        si=sc.nextInt();
        ei=sc.nextInt();
       System.out.println(substring(name, si, ei));
      
    }
}
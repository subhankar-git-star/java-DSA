public class backtraking{
    public static void back(int arr[],int si,int num){
        if(si==arr.length){
            print(arr);
            return;
        }
        arr[si]=num;
        back(arr, si+1, num+1);
        arr[si]=arr[si]-2;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println("");
    }
    public static void substring(String str,String temp,int i){
        if(i==str.length()){
            System.out.println(temp);
            return;
        }
        // yes
        substring(str, temp+str.charAt(i), i+1);
        // no
        substring(str, temp, i+1);
    }
    public static void permutation(String str,String temp){
        if(str.length()==0){
            System.out.println(temp);
            return;
        }
        for( int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            permutation(newstr, temp+curr);
        }
    }
public static void main(String[] args) {
    // int arr[]=new int[5];
    // back(arr, 0, 1);
    // print(arr);
    String str="abc";
    permutation(str, " ");
}
}
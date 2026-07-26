public class Recursion{
    public static void rev(int number){
        if(number==1){
            System.out.println(1);
            return;
        }
        System.out.print(number+" ");
        rev(number-1);
    }
    public static void inc(int number){
        if(number==1){
            System.out.print(number+" ");
            return;
        }
        
        inc(number-1);
        System.out.print(number +" ");
    }
     public static int fac(int number){
        if(number==0){
            return 1;
        }
        int fn=number*fac(number-1);
        return fn;
    }
    public static int sum(int number){
        if(number==1){
            return 1;
        }
        
        int temp=sum(number-1);
        int sum=number+temp;
        return sum;
    }
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static int find(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
    
        return find(arr, i+1,key);
    }
    public static int lastocc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int found=lastocc(arr, key, i+1);
        if(found==-1 && arr[i]==key){
            return i;
        }
        return found;
    }
    public static int power(int n,int i){
        if(i==0){
            return n;
        }
       int xnm1=power(n,i-1);
       int pow=n*xnm1;
       return pow;
    }
    public static void findarr(int arr[],int key,int i){
        if(i==arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
         findarr(arr,key,i+1);
    }
    public static void print(int number){
        String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(number==0){
            return;
        }
        int mod=(number%10);
        print(number/10);
        System.out.print(str[mod]+" ");
    }
    public static void print(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        print(arr, si, mid);
        // print(arr, ei+1, ei);
        System.out.println(arr[mid]+"");
    }
    public static void dublication(String str,int idx,StringBuilder newstring,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            dublication(str, idx+1, newstring, map);
        }else{
            map[curr-'a']=true;
            dublication(str, idx+1, newstring.append(curr), map);
        }
    }
    public static void main(String[] args) {
       String str="appnacollege";
       dublication(str, 0, new StringBuilder(), new boolean[26]);
       
    }
}
    
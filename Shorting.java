
import java.util.Scanner;

public class Shorting{
    // print array
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    // bubble sort
    public static void bubbleshort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    //selection sort
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
            
        }
    }

    //inserction sort
    public static void inserction(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       inserction(arr);
        print(arr);
    }
}
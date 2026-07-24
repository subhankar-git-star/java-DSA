

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

    //marge sort
    public static void margesort(int arr[],int si ,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        margesort(arr, si, mid); // left part
        margesort(arr, mid+1, ei); //right part
        marge(arr,si,mid,ei);
    }

    public static void marge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }else{
                temp[k]=arr[j];
                j++;k++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
            j++;k++;
        }
        for(int m=0,s=si;m<temp.length;m++,s++){
            arr[s]=temp[m];
        }
    }
    // quick sort
    public static void Quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int idx=partitation(arr,si,ei);
        Quicksort(arr, si, idx-1);
        Quicksort(arr, idx+1, ei);
    }
    
    public static int partitation(int arr[],int si,int ei){
        int pevit=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pevit){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pevit;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    // search roted array
    public static int search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){ //for line 1
            if(arr[si]<=arr[mid] && arr[mid]<=arr[ei]){
                return search(arr, target, si, mid-1);
            }
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                return search(arr, target, si, mid-1);
            }
        }
    } 
    
    public static void main(String[]args){
        int arr[]={4,5,6,7,0,1,2};
      int n= search(arr, 0, 0, arr.length-1);
      System.out.println(n);
    }
} 
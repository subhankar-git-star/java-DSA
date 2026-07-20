public class array{

  public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println(" ");
    }

  public static int binaryscarch(int number[],int key){
    int first=0;
    int last=number.length-1;
    while(first<=last){
      int mid=(first+last)/2;
      if(number[mid]==key){
        return mid;
      }
      if(number[mid]<key){
        first=mid+1;
      }
      else{
        last=mid-1;
      }
    }return -1;
  }
  public static void sclectionsort(int number[]){
    for(int i=0;i<number.length;i++){
      int min=i;
      for(int j=i+1;j<number.length-1;j++){
        if(number[j]>number[min]){
          min=j;
        }
      }
      int temp=number[i];
      number[i]=number[min];
      number[min]=temp;
    }
    
  }
  public static void kadanes(int number[]){
      int mv=Integer.MIN_VALUE;
      int cv=0;
        for(int i=0;i<number.length;i++){
            cv=cv+number[i];
            if(cv<0){
                cv=0;
            }
            mv=Math.max(cv, mv);
        }
        System.out.println(mv);
  }

  public static int trappwater(int height[]) {
        int n = height.length;

        // left max array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // right max array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // water calculation
        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
// pairs
 public static void paris(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int temp=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+temp+","+number[j]+")");
                tp++;
            }System.out.println();
        }System.out.println(tp);
    }
    
}
  public static void maxsum(int number[]){
    int max=Integer.MIN_VALUE;
      for(int i=0;i<number.length;i++){
        for(int j=i;j<number.length;j++){
          int sum=0;
          for (int k=i;k<=j;k++){
            sum=sum+number[k];
            System.out.print(number[k]+" ");
            }if(max<sum){
            max=sum;
            }
              
                
            }  
        }  System.out.println("the maximum sum is"+max);
    }
    public static void revarse(int number[] ){
        int first=0;int last=number.length-1;
        while(first<last){
        int edit=number[first];
        number [first]=number [last];
        number [last]=edit;
        first++;
        last--;
        }
    }
    public static int dup(int number[]){
      if(number.length==0){
        return 0;
      }
      int i=0;
      for(int j=1;j<number.length;j++){
        if(number[i]!=number[j]){
          i++;
          number[i]=number[j];
        }
      }
      return i+1;
    }

    //pairs of array
    public static void pairs(int arr[]){
      for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
           System.out.print("("+arr[i]+","+arr[j]+")");
        }System.out.println("");
      }
    }

     // sub array
    public static void subarray(int arr[]){
      for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
          for(int k=i;k<=j;k++){
             System.out.print(arr[k]+" ");
          }
        }System.out.print("");
      }System.out.println("");
     }

     //max subarray sum
     public static int maxsubarraysum(int arr[]){
      int max=Integer.MIN_VALUE;
      int curr;
      for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
          curr=0;
          for(int k=i;k<=j;k++){
           curr+=arr[k];
          }
          if(curr>max){
            max=curr;
          }
        }
      }
      return max;
     }

     //prefix sum
     public static int prefixsum(int arr[]){
      int temp[]=new int[arr.length];
      temp[0]=arr[0];
      for(int i=1;i<arr.length;i++){
        temp[i]=arr[i]+temp[i-1];
      }
      int max=Integer.MIN_VALUE;
      int curr;
      for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
          
         curr=(i==0)?temp[j]:temp[j]-temp[i-1];
         if(curr>max){
          max=curr;
        }
        }
        
      }
      return max;
     }

     //kadanas algotithm
     public static void kadans(int arr[]){
      int ms=Integer.MIN_VALUE;
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        if(sum<0){
          sum=0;
        }
        ms=Math.max(sum,ms);
      }
     System.out.println("the maximum sum is "+ms);
     }
  public static void main(String[]args){
   int arr[]={1,2,4,3,5};
   kadans(arr);
  }


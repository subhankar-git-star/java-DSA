public class practice{
    public static int rainwater(int hight[]){
        int n=hight.length;
        // left max
        int lm[]=new int[n];
        lm[0]=hight[0];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(hight[i], lm[i-1]); 
        }

        // right max
        int rm[]=new int[n];
        rm[n-1]=hight[n-1];
        for(int i=n-2;i>=0;i--){
            rm[i]=Math.max(hight[i],rm[i+1]);
        }
        // water lavel
        int trappedwater=0;
        for(int i=0;i<n;i++){ 
            int waterlavel=Math.min(lm[i], rm[i]);
            trappedwater+=waterlavel-hight[i];
        }
        return trappedwater;
    }
    public static void mergesort(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<=0){
                temp[k]=arr[i];
                k++;i++;
            }
            else{
                temp[k]=arr[j];
                k++;j++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
                k++;i++;
        }
        while(j<=ei){
            temp[k]=arr[j];
                k++;j++;
        }
        for(int s=0,t=si;s<temp.length;s++,t++){
            arr[t]=temp[s];
        }

    }
    
    public static void main(String[]args){
    String arr[] = { "sun", "earth", "mars", "mercury"};
    mergesort(arr, 0, arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
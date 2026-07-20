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
    public static void main(String[]args){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(rainwater(arr));
    }
}
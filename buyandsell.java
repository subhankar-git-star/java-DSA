public class buyandsell{
    public static int buyandsell(int prise[]){
        int bp=Integer.MAX_VALUE;
        int mp=0;
        for(int i=0;i<prise.length;i++){
            if(bp<prise[i]){
                int profit=prise[i]-bp;
                mp=Math.max(profit, mp);
            }
            else{
                bp=prise[i];
            }
            
            
        }
        return mp;
    }
    public static void main(String[] args) {
        int prise[]={7,1,5,3,6,4};
       
        System.out.println( buyandsell(prise));
    }
}
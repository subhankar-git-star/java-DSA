public class bitmanipilation{
    public static int getbit(int i,int n){
        int Bitmask=1<<i;
        if((n&Bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void oddoreven(int n){
        
        if((n & 1)==0){
            System.out.println("it is a even number");
        }else{
            System.out.println("it is a odd number");
        }
    }
    public static int setithbit(int number, int i){
        int Bitmask=1<<i;
        return number|Bitmask;
    }
    public static int clearithbit(int number, int i){
        int Bitmask=~(1<<i);
        return (Bitmask&number);
    }
    public static void main(String[] args) {
        System.out.println(clearithbit(000110, 1));
        // oddoreven(100000000);
        
    }
}
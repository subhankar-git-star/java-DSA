 class Baubleshort{
    public static void shortarray(int number[]){
       for(int i=0;i<number.length-1;i++){
            for(int j=0;j<number.length-1-i;j++){
                if(number[j]>number[j+1]){
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
        }
    }




    public static void sclectionshort(int number[]){
        for(int i=0;i<number.length-1;i++){
            int small=i;
            for(int j=i+1;j<number.length;j++){
                if(number[small]>number[j]){
                    small=j;
                }
            }
            int temp=number[small];
            number[small]=number[i];
            number[i]=temp;
        }
    }




    public static void intertionshot(int number[]){
        for(int i=1;i<number.length;i++){
            int curr=number [i];
            int pri=i-1;
            while(number[pri]>number[curr]&&pri>=0){
                number[pri+1]=number[pri];
                pri--;
            }
            number[pri + 1] = curr;
        }
    }




    public static void printnumber(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int number[]={6,8,2,4,1,3,5,7};
        shortarray(number);
        printnumber(number);
    }
}

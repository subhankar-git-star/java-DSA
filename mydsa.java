public class Mydsa {

    public static int[] total(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == key) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


public static void reverse(int number[]){
    int statd=0;
    int end=number.length-1;
    while(statd<end){
        int temp=number[statd];
        number[statd]=number[end];
        number[end]=temp;
        statd++;
        end--;
    }
}


public static int linierscarch(int number[],int key){
    int first=0;int last=number.length-1;
    while(first<=last){
        int mid=(first+last)/2;

        if(number[mid]==key){
            return mid;
        }
        if(key<number[mid]){
            last=mid-1;
        }
        else{
            first=mid+1;
        }

    }
    return -1;
}
public static void bubblesort(int number[]){
    for (int i=0;i<number.length-1;i++){
        for(int j=0;j<number.length-1-i;j++){
            if(number[j]>number[j+1]){

            int temp=number[j];
            number[j]=number[j+1];
            number[j+1]=temp;
            }
        }
    }
}

public static void selectionsort(int number[]){
    for (int i=0;i<number.length-1;i++){
        int current=i;
        for(int j=i+1;j<number.length;j++){
            if(number[current]>number[j]){
                 current=j;
           
            }
            
        }
        int temp = number[current];
            number[current] = number[i];
            number[i] = temp;
         
    }
}

public static void ptint(int number[]){
    for (int i=0;i<number.length;i++){
        System.out.print(number[i]+" ");
    }System.out.println(" ");
}

public static void rev(int number[]){
    int first=0; int last=number.length-1;
    while(first<last){
        int temp=number[first];
        number[first]=number[last];
        number[last]=temp;
        first++;
        last--;
    }

}

public static void pri(int number[]){
for(int i=0;i<number.length;i++){
    System.out.print(number[i]+" ");
}
}
public static int getlargest(int number[]){
    int maxsum=Integer.MIN_VALUE;
    
    for(int i=0;i<number.length;i++){
        int first=i;
        for(int j=i;j<number.length;j++){
            int last=j;
            int largest=0;
            for(int k=first;k<=last;k++){
                largest+=number[k];
            }
            if(maxsum<largest){
                maxsum=largest;
            }
        }
    }
    return maxsum;
}
public static int findlargest(int number[]){
    int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
        if(number[i]>max){
            max=number[i];
        }
        
        if(number[i]<min){
            min=number[i];
            
        }System.out.println(min);
    }
    return max;
}
public static int trw(int number[]){
    int n=number.length;
    int lb[]=new int [n];
    lb[0]=number[0];
    for(int i=1;i<n;i++){
        lb[i]=Math.max(number[i], lb[i-1]);
    }

    int rb[]=new int [n];
    rb[n-1]=number[n-1];
    for(int i=n-2;i>=0;i--){
        rb[i]=Math.max(number[i], rb[i+1]);
    }

    int trappedwater =0;
    for(int i=0;i<n;i++){
        int waterlavel=Math.min(lb[i], rb[i]);
        trappedwater+=waterlavel-number[i];
    }return trappedwater;
}

public static int[] findsum(int[] number,int key){
    for(int i=0;i<number.length;i++){
        for(int j=i+1;j<number.length;j++){
            if(number[i]+number[j]==key){
                System.out.println(number[i]+" ,"+number[j]);
                return new int[]{i,j};
            
            }
        }
    }
    return new int[]{-1,-1};
}


}
public static void main(String[] args) {
//    int matrix[][]= new int [3][3];
//     Scanner sc=new Scanner(System.in);
int arr[]={2,2,1,1,1,2,2};


}


    
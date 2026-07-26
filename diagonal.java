public class Diagonal{
    public static int diagonal(int matrix[][]){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;i++
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void scarch(int matrix[][],int key){
        int scarchkey=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    scarchkey++;
                }
            }
        }
        System.out.println("the total number is"+scarchkey);
    }
    public static int total(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==1){
                    sum+=matrix[i][j];
                }
            }
        }return sum;
    }
public static void main (String[]args){
int matrix[][]={ {1,4,9},{11,4,3},{2,2,3} };
System.out.println("the sum of 2nd row is"+total(matrix));
}
}
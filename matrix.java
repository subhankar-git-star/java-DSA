
import java.util.*;

public class matrix{
    // find maximum
    public static int maximum(int matrix[][]){
     int max=Integer.MIN_VALUE;
      for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               max=Math.max(max, matrix[i][j]);
            }
        }
        return max;
    }

    //find minimum
    public static int minimum(int matrix[][]){
     int min=Integer.MAX_VALUE;
      for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               min=Math.min(min, matrix[i][j]);
            }
        }
        return min;
    }

    // matrix multiplication
    public static int[][] multiplication(int arr1[][],int arr2[][],int m,int n,int p,int q){
        if(n!=p){
            System.out.println("matrix multiplication is impossible");
            return null ;
        }
        int result[][]=new int[m][q];
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                result[i][j]=0;
                for(int k=0;k<n;k++){
                    result[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        } 
        return result; 
    }


    //print matrix
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter row and comumn of first matrix ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[][]=new int[m][n];
        System.out.println("enter first matrix element");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println(" enter row and comumn of second matrix ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int arr2[][]=new int[p][q];
        System.out.println("enter second matrix element");
         for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int ans[][] = multiplication(arr1, arr2, m, n, p, q);

if (ans != null) {
    System.out.println("Resultant Matrix:");

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < q; j++) {
            System.out.print(ans[i][j] + " ");
        }
        System.out.println();
       }
    }
    }
}
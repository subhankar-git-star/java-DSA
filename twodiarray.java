

public class twodiarray{
public static int diadonalsum(int matrix[][]){
    int sum=0;
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix.length;j++){
//             if(i==j){
//                 sum+=matrix[i][j];
//             }
//             else if(i+j==matrix.length-1){
//                 sum+=matrix[i][j];
//             }
//         }
//     }return sum;
//optimize
  for(int i=0;i<matrix.length;i++){
sum+=matrix[i][i];
if(i!=matrix.length-1-i){
    sum+=matrix[i][matrix.length-1-i];
}
}return sum;
}
public static boolean scarch(int matrix[][],int key){
    int row=0,col=matrix[0].length-1;
      while(row<matrix.length && col>=0){
        if(matrix[row][col]==key){
            System.out.println(row+","+col);
            return true;
        }
        else if(key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
        
}return false;

    public static int twosum(int matrix[][]) {
        int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[1][j];
            }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1,4,9},
            {1,4,3},
            {2,2,3}
        };

        System.out.println(twosum(matrix));
    }
}
}
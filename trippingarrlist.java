
import java.util.ArrayList;

public class trippingarrlist{
    public static int getwater(ArrayList<Integer>hight){
        int maxwater=0;
        for(int i=0;i<hight.size();i++){
            for(int j=i+1;j<hight.size();j++){
                int ht=Math.min(hight.get(i), hight.get(j));
                int width=j-i;
                int getwater=ht*width;
                maxwater=Math.max(maxwater, getwater);
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>higth=new ArrayList<>();
        higth.add(1);
        higth.add(8);
        higth.add(6);
        higth.add(2);
        higth.add(5);
        higth.add(4);
        higth.add(8);
        higth.add(3);
        higth.add(7);
        System.out.println(getwater(higth));
    }
}

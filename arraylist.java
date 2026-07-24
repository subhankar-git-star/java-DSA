import java.util.ArrayList;
//bruteforce approch
public class Arraylist{
    public static int storewater(ArrayList<Integer>heigth){
    int max=0;
    for(int i=0;i<heigth.size();i++){
        for(int j=i+1;j<heigth.size();j++){
           int ht=Math.min(heigth.get(i),heigth.get(j));
           int width=j-i;
           int water=width*ht;
          max= Math.max(water, max);
        }
    }
    return max;
}

//two pointerapproch
public static int pstorewater(ArrayList<Integer>height){
    int si=0;
    int ei=height.size()-1;
    int maxwater=0;
    while(si<ei){
        int ht=Math.min(height.get(si), height.get(ei));
        int wedth=ei-si;
        int total=wedth*ht;
        maxwater=Math.max(total, maxwater);
        if(height.get(si)<height.get(ei)){
            si++;
        }
        else{
            ei--;
        }
    }
    return maxwater;
}

// pairsum(bruteforce)
public static boolean pairsum(ArrayList<Integer>height,int target){
     int si=0;
    int ei=height.size()-1;
    while(si != ei){
        if(height.get(si)+height.get(ei)==target){
            return true;
        }
        if(height.get(si)+height.get(ei)<target){
            si++;
        }
        else{
            ei--;
        }
    }
    return false;
}
//pairsum(2) modulo operator
public static boolean pairsum2(ArrayList<Integer>height,int target){
    int bp=-1;
    int n=height.size();
    for(int i=0;i<n-1;i++){
        if(height.get(i)>height.get(i+1)){
            bp=i;
            break;
        }
    }
    int lp=bp+1;
    int rp=bp;
    while(lp !=rp){
        if(height.get(lp)+height.get(rp)==target){
            return true;
        }
        if(height.get(lp)+height.get(rp)<target){
            lp=(lp+1)%n;
        }else{
            rp=(n+rp-1)%n;
        }
    }
    return false;
}

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
       
        System.out.println(pairsum2(list, 16));
        
       
    }}


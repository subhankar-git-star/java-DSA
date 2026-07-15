
public class oops{
    static class student{
        String name;
        int roll;
        double per;
        void setname(String newname){
            name=newname;
        }

        void setroll(int newroll){
            roll=newroll;
        }

        void setper (double newper){
            per=newper;
        }
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.setname("amanbiswas");
        s1.setper(56.5);
        s1.setroll(34);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.per);

    }
} 
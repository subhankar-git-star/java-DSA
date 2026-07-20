public class OOPS{

    public static void main(String[] args) {
       student s1=new student();
       s1.name="subhankar";
       s1.roll=45;
       s1.password=3535;
       student s2=new student(s1);
       

    }
}
class student{
    String name;
    int roll;
    int password;
    int marks[];
    student(){
        marks=new int[3];
        System.out.println("constructor is called");
    }
    // shallow copy constructure // copy constructure
    student(student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    student(String name){
        marks=new int[3];
        this.name=name;
    }
    student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
    
}

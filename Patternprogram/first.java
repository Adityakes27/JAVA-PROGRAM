class student {
    int id;
    String name;
    void display() {
    System.out.println(id +" " + name);
    }
}
public class first{
    public static void main(String[] args) {
        student s1=new student();
        s1.id=222;
        s1.name="ADITYA";
        s1.display();

        
    }
}

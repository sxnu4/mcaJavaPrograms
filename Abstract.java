abstract class StudentInfo{
    abstract void printinfo();
}


class Student extends StudentInfo{
    void printinfo(){

        int roll=24136;
        String name="Sonu";
        float fee=33156.3F;
        System.out.println(roll);
        System.out.println(name);
        System.out.println(fee);
    }
    

}

public class Abstract {
    public static void main(String[] args) {
        StudentInfo st = new Student();
        st.printinfo();

        // System.out.println("Hola Amigo!! Its test Line.");
    }
}

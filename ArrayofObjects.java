import java.util.Scanner;
class Random {
    public static void main(String[] args) {
        
        
        Student arr[];
        arr = new Student[5];
        arr[0]=new Student("Sonu","Neelkanth Hostel","sonu.ok433@gmail.com",1256458621);
        arr[1]=new Student("Paras","Neelkanth Hostel","parasetc@gmail.com",1256453321);
        arr[2]=new Student("Sujjain","Neelkanth Hostel","Sujjain@gmail.com",1256457821);
        arr[3]=new Student("Aditya","Neelkanth Hostel","Aditya@gmail.com",1226898621);
        arr[4]=new Student("Aryan","Neelkanth Hostel","aryan@gmail.com",1256898621);
        System.out.println("Student data in student arr 0: ");
        arr[0].Displaystudentdata();
        System.out.println("Student data in student arr 1: ");
        arr[1].Displaystudentdata();
        System.out.println("Student data in student arr 2: ");
        arr[2].Displaystudentdata();
        System.out.println("Student data in student arr 3: ");
        arr[3].Displaystudentdata();
        System.out.println("Student data in student arr 4: ");
        arr[4].Displaystudentdata();
        
    }
}
class Student {
    public int mobile;
    public String name;
    public String address;
    public String gmail;
    Student(String name, String address, String gmail, int mobile){
        this.name=name;
        this.address=address;
        this.gmail=gmail;
        this.mobile=mobile;
        
    }
    public void Displaystudentdata()
    {
        System.out.println("Student name is: " + name + " \n"
                           + "and Student address is: "
                           + address +  " \n"
                           + "and student gmail is: " + gmail +   " \n" + "and student's mobile numebr is: " + mobile);
        System.out.println();
    }
    
}
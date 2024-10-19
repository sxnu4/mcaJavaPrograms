import java.util.Scanner;

class ArrofObject {
    String name;
    String address;
    String contactnumber;
    String email;

    public ArrofObject() {
        name = "name not give";
        address = "address not given";
        contactnumber = "contactnumber not given";
        email = "email not given";

    }

    public void setData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Address: ");
        address = scan.nextLine();
        System.out.print("Contact Number: ");
        contactnumber = scan.nextLine();
        System.out.print("Email: ");
        email = scan.nextLine();
    }

    public void display() {
        System.out.println("************************************");
        System.out.println("* Name: " + name);
        System.out.println("* Adress: " + address);
        System.out.println("* Contact Number: " + contactnumber);
        System.out.println("* Email: " + email);
        System.out.println("************************************");

    }
}

public class StudentInfo {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = scan.nextInt();
        ArrofObject[] student = new ArrofObject[n];
        System.out.println("Enter the details of students:");
        for (int i = 0; i < n; i++) {
            student[i] = new ArrofObject();
            student[i].setData();
            // student[i].display();

        }
        System.out.println("Data of all Students\n");
        for (int i = 0; i < n; i++) {
            student[i].display();

        }
    }
}
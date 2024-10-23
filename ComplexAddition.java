import java.util.*;
class Complex {
    int real, imagin;
    Complex(){}
    Complex(int tempReal, int tempimagin){
        real = tempReal;
        imagin = tempimagin;

    }
    Complex addComplex(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.real = c1.real + c2.real;
        c3.imagin = c1.imagin + c2.imagin;
        return c3;
    }
    Complex multiComplex(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.real = (c1.real*c2.real-c1.imagin*c2.imagin);
        c3.imagin = (c1.real*c2.imagin+c1.imagin*c2.real);
        return c3;
    }
}
public class ComplexAddition{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Complex c1 = new Complex();
        System.out.print("Enter your 1st real number: ");
        c1.real=scanner.nextInt();
        System.out.print("Enter your 1st imaginary number: ");
        c1.imagin=scanner.nextInt();
        Complex c2 = new Complex();
        System.out.print("Enter your 2nd real number: ");
        c2.real=scanner.nextInt();
        System.out.print("Enter your 2nd imaginary number: ");
        c2.imagin=scanner.nextInt();
        // Complex c1 = new Complex(3, 2);
        System.out.println("Complex number 1 is : " + c1.real+ " + "+  c1.imagin+"i");
        
        // Complex c2 = new Complex(1, 4);
        System.out.println("Complex number 2 is : " + c2.real+ " + "+  c2.imagin+"i");
        
        Complex c3 = new Complex();
        c3=c3.addComplex(c1, c2);
        System.out.println("Sum of the Complex numbers : " + c3.real+ " + "+  c3.imagin+"i");
        c3=c3.multiComplex(c1, c2);
        System.out.println("Multiplication of two Complex numbers : " + c3.real+ " + "+  c3.imagin+"i");

        
    }
}
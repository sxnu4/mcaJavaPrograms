import java.util.Scanner;
public class MiniCalc {
    public MiniCalc() {
  
  }
  
  public int add(int a, int b) {
    return a + b;
  }
  
  public int subtract(int a, int b) {
    return a - b;
  }
  
  public int multiply(int a, int b) {
    return a * b;
  }
  
  public int divide(int a, int b) {
    if (b == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
    return 0;
    }
  else { 
    return a / b;
  }
  }
    
    public int modulo(int a, int b) {
      if (b == 0) {
        System.out.println("Error! Dividing by zero is not allowed.");
      } 
      else {
        return a % b;
      }
    return b;
    }
      public static void main(String[] args) {
        MiniCalc myCalculator = new MiniCalc();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
      }
    }

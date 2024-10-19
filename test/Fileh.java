package test;

public class Fileh {

    public static void main(String args[]) {
      try {
        int a = 15;
        int b = 5;
  
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
  
        int c = a / b;
        System.out.println("a / b = " + c);
      } 
      catch (Exception e) {
        System.out.println("Exception Thrown: " + e);
      }


      //Either you can use Finally{} or not it totally depends on you.
     /* finally{
        System.out.println("Code executed finally,")
    }*/
    System.out.println("Code executed finally,");
    }
  }
class Substring {
    public static void main(String[] args) {
      // create a string
      String txt = "Ich bin Spark.";
      String str1 = "Spark";
      String str2 = "Ich bin Spark. Hello, ";
  
      boolean result = txt.contains(str1);
      if(result) {
        System.out.println(str1 + " is present in the string.");
      }
      else {
        System.out.println(str1 + " is not present in the string.");
      }
  
      result = txt.contains(str2);
      if(result) {
        System.out.println(str2 + " is present in the string.");
      }
      else {
        System.out.println(str2 + " is not present in the string.");
      }
    }
  }
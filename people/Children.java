package people;
 
public class Children{
    private String name;
 
    public Children( ) {
        name = "Unknown";
    }
    
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
    
       public String getName() {
           return name;
       }
    public static void main(String[] args) {
        // Children child = new Children();
        
    }
}
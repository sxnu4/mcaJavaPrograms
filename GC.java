public class GC {
    public void finalize(){System.out.println("object is garbage collected");}  
    public static void main(String[] args) {
        // System.out.println("Programme worked successfully.");
        GC s1=new GC();  
        GC s2=new GC();  
        s1=null;  
        s2=null;  
        System.gc();  
    }
    
}
     
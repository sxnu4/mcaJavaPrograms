interface Interface1{
    void Dance();
}
interface Interface2{
    void Run();
}
class Man implements Interface1, Interface2{
    public void Dance(){
        System.out.println("That man is dancing.");
    }
    public void Run(){
        System.err.println("That man is running.");
    }
}
class Interface{
    public static void main(String[] args){
        Man man = new Man();
        man.Dance();
        man.Run();
    }
}

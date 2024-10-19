import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        size=sc.nextInt();
        
        int[] arr=new int[size];
        System.out.println("Enter the elements of Array: \n");
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Elements of Array are: \n");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
        
              

    }
    
}

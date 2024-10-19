import java.util.Scanner;
public class Bubblesort{
    public static void main(String[] args){
        int size,i,j,temp;
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
        boolean swapped;
        for (i = 0; i < size - 1; i++) {
            swapped = false;
            for (j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
            break;
        }
        
        System.out.println("\nArray after applying Bubble sort: \n");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
        
              

    }
    
}

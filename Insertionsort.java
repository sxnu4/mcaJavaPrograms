import java.util.Scanner;

public class Insertionsort {
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
        for (i = 1; i < size; i++) {
            int key = arr[i];
            j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1; 
            }
            arr[j + 1] = key;
        }

        System.out.println("\nArray after applying Insertion sort: \n");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
              

    }

}

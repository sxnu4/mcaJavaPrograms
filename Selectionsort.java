import java.util.Scanner;
public class Selectionsort {
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
        for (i = 0; i < size-1; i++) {
            for(j=i+1;j<size;j++){
            if(arr[i]>arr[j]){

                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

            }
        }

        System.out.println("\nArray after applying Selection sort: \n");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
              

    }

}

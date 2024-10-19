class Insertionsort {
    public static void Inserion_sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
   }
   public static void main(String[] args) {
    int[] arr={9,14,3,2,43,11,58,22};
    System.out.println("Before Insertion Sort: \n");
    for(int  i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("\n");
    Inserion_sort(arr);
    System.out.println("After Insertion Sort: \n");
    for(int  i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");

    }

   }
}

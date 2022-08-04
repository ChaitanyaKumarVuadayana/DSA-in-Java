/* In Selection sort, Smallest element is bring up to the first by swaping one time in one loop. */


class SelectionSort {
    public static void main(String [] args) {
        // Given Arrya
        int [] arr = {9,8,7,6,5,4};
        // Selection sort
        for (int i=0; i<arr.length-1; i++) {
            // Smallest element index
            int smallest = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        for (int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i] + " < ");
        }
        System.out.println(arr[arr.length-1]);
    }
}

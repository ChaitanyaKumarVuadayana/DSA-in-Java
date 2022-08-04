class BubbleSort {
    public static void main(String [] args) {
        // Given Arrya
        int [] arr = {5,4,3,2,8,1,9};
        // Bubble sort
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Printing Sorted arrya
        for (int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i] + " < ");
        }
        System.out.println(arr[arr.length-1]);
    }
}

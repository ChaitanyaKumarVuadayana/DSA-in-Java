/* In Insertion sort Arrya is divided into two parts, One on left side is Sorted Arrya and one on right side UnSorted Arrya. In the begining Sorted arrya
   contains only one element and after every loop Sorted Arrya Increases and UnSorted arrya Decreases. In very loop first element from UnSorted arrya shifted 
   to Sorted arrya to it's correct position by checking with a while loop each element is shifeted towards right to place current element to it's correct position. */


class Tree {
    public static void main(String [] args) {
        // Given Arrya
        int [] arr = {7,8,3,1,2};
        // Insertion sort
        for (int i=0; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // placment  
            arr[j+1] = current;
        } 
        for (int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i] + " < ");
        }
        System.out.println(arr[arr.length-1]);
    }
}

// Contributed by Chaitanya Kumar

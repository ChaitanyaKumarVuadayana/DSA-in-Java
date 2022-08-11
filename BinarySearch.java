// Arrya must br already Sorted to use Binary Search

class Main {

    public static void main(String [] args) {
        int [] arr = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
        Binary B = new Binary();
        B.BinarySearch(arr, 17);
    }
}

class Binary {
    public void BinarySearch(int [] arr, int target) {
        int LowPoint = 0;
        int HighPoint = arr.length-1;
        int MidPoint = 0;

        while (arr[MidPoint] != target) {
            MidPoint = (LowPoint + HighPoint) / 2;
            if (arr[MidPoint] < target) {
                LowPoint = MidPoint + 1;
            }
            else if (arr[MidPoint] >= target) {
                HighPoint = MidPoint - 1;
            }
        }
        System.out.println("Target: " + target + " found at index: " + MidPoint);
    }
}

// This code is contributed by Chaitanya Kumar

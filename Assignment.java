public class Assignment {
    public static void main(String[] args) {
        Arrya A = new Arrya();
        System.out.println("\n");
        A.insertAtStart(7);
        A.insertAtEnd(7);
        A.insertAt(12, 3);
        A.deleteAtStart();
        A.deleteAtEnd();
        A.deleteAt(4);
        A.reverse();
        System.out.println("Minimum: " + A.min() + "\n");
        System.out.println("Maximum: " + A.max() + "\n");
        A.sort("inc");
        A.sort("dec");
    }
}

class Arrya {
    int[] arr = { 2, 3, 4, 5, 6 };
    // int [] arr = {7,4,1,8,5,2,9,6,3};

    public void insertAtStart(int ele) {
        int [] arr1 = new int [arr.length];
        arr1[0] = ele;
        for (int i=1; i<arr.length; i++) {
            arr1[i] = arr[i-1];
        }
        System.out.print("Insert At the beginning: ");
        for (int j=0; j<arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println("\n");
    }

    public void insertAtEnd(int ele) {
        int [] arr2 = new int[arr.length];
        arr2[arr.length-1] = ele;
        for (int i=0; i<arr.length-1; i++) {
            arr2[i] = arr[i];
        }
        System.out.print("Insert At the End: ");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println("\n");
    }

    public void insertAt(int ele, int At) {
        int [] arr3 = new int[arr.length];
        arr3[At-1] = ele;
        for (int i=0; i<arr.length; i++) {
            if (i<At-1) {
                arr3[i] = arr[i];
            }
            else if(i>At-1) {
                arr3[i] = arr[i-1];
            }
        }
        System.out.print("Insert At " + ele + ": ");
        for (int j = 0; j < arr3.length; j++) {
            System.out.print(arr3[j] + " ");
        }
        System.out.println("\n");
    }

    public void deleteAtStart() {
        System.out.print("Delete At Start: ");
        for (int j = 1; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");
    }

    public void deleteAtEnd() {
        System.out.print("Delete At End: ");
        for (int j = 0; j < arr.length-1; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");
    }

    public void deleteAt(int At) {
        System.out.print("Delete At " + At + ": ");
        for (int j = 0; j < arr.length; j++) {
            if (j == At-1) {
                continue;
            }
            else {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println("\n");
    }

    public void reverse() {
        System.out.print("Reverse: ");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public int min() {
        int min = 10^5;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int max() {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public void sort(String inc_dec) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        if (inc_dec == "inc") {
            System.out.print("Increase Sorted arrya: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
        }
        else if (inc_dec == "dec") {
            System.out.print("Decrease Sorted arrya: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
        }
    }
}

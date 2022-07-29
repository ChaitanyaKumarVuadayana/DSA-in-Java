
class Stack {
    int[] StackArr = new int[5];
    int top = -1;

    public void push(int data) {
        StackArr[top + 1] = data;
        top++;
    }

    public void pop() {
        StackArr[top] = 0;
        top--;
    }

    public void peek() {
        System.out.println(StackArr[top] + " <-- " + "Top");
    }

    public void show() {
        for (int i = StackArr.length - 1; i >= 0; i--) {
            if (StackArr[i] == StackArr[top]) {
                System.out.println(StackArr[i] + " <-- " + "Top");
            } else {
                System.out.println(StackArr[i]);
            }
        }
    }
}

class leetcode {
    public static void main(String[] args) {
        Stack S = new Stack();
        S.push(5);
        S.push(10);
        S.push(15);
        S.push(30);
        System.out.println("Stack:");
        S.show();
        System.out.println("\nStack after pop()");
        S.pop();
        S.show();
        System.out.println("\nPeek value:");
        S.peek();
    }
}

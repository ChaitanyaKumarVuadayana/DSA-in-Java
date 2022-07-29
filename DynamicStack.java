
class DyStack {
    int capacity = 2;
    int [] StackArr = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (size() == capacity-1) {
            expand();
        }
        StackArr[top] = data;
        top++;
    }

    public void pop() {
        if (size()-1 == (capacity/2)/2) {
            shrink();
        }
        StackArr[top-1] = 0;
        top--;
    }
    public void peek() {
        System.out.println(StackArr[top-1] + " <-- " + "Top");
    }
    public int size() {
        return top;
    }
    private void expand() {
        int len = size();
        int [] newDyStack = new int[capacity*2];
//        This method is also used to copy array
//        System.arraycopy(StackArr,0,newDyStack,0,len+1);
        for (int i=0; i<len+1; i++) {
            newDyStack[i] = StackArr[i];
        }
        StackArr = newDyStack;
        capacity *= 2;
    }
    private void shrink() {
        int len = size();
        capacity = capacity / 2;
        int [] newDyStack = new int[capacity];
//        This method is also used to copy array
//        System.arraycopy(StackArr,0,newDyStack,0,len+1);
        for (int i=0; i<len+1; i++) {
            newDyStack[i] = StackArr[i];
        }
        StackArr = newDyStack;

    }
    public void show() {
        for (int i=StackArr.length-1; i>=0; i--) {
            if (StackArr[i] == StackArr[top-1]) {
                System.out.println(StackArr[i] + " <-- " + "Top");
            }
            else {
                System.out.println(StackArr[i]);
            }
        }
    }
}

class A1 {
    public static void main(String [] args) {
        DyStack S = new DyStack();
        S.push(5);
        System.out.println("Stack:");
        S.show();
        System.out.print("\nSize: ");
        System.out.println(S.size() + " units");
        S.push(10);
        S.push(15);
        S.push(30);
        S.push(35);
        System.out.println("\nStack:");
        S.show();
        System.out.print("\nSize: ");
        System.out.println(S.size() + " units");
        System.out.println("\nStack after pop()");
        S.pop();
        S.pop();
        S.pop();
        S.show();
        System.out.print("\nSize: ");
        System.out.println(S.size() + " units");
        System.out.println("\nPeek value:");
        S.peek();
    }
}

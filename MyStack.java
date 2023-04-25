public class MyStack {
    private Integer[] array = new Integer[10];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(int item) {
        if (size == array.length) {
            Integer[] newArray = new Integer[array.length + 10];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = item;
    }

    public int peek() {
        return array[size - 1];
    }

    public int pop() {
        return array[--size];
    }
}


// Реализовать стэк с помощью массива. 

// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class task5 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.empty());
        System.out.println("Numbers of el in stack: " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}

package Day3;

import java.util.ArrayDeque;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        //기본 개념
//        stack.push(10);
//        stack.push(5);
//        System.out.println("stack.peek() = " + stack.peek());
//        stack.push(6);
//        System.out.println("stack.pop() = " + stack.pop());
//        stack.push(4);
//        System.out.println("stack.pop() = " + stack.pop());
//        System.out.println("stack.pop() = " + stack.pop());
//        System.out.println("stack.pop() = " + stack.pop());

        //ArrayDeque로 stack 구현
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        stack.addLast(10);
//        stack.addLast(5);
//        System.out.println("stack.peekLast() = " + stack.peekLast());
//        stack.addLast(7);
//        System.out.println("stack.peekLast() = " + stack.pollLast());
//        System.out.println("stack.peekLast() = " + stack.pollLast());
//        System.out.println("stack.peekLast() = " + stack.pollLast());
//        System.out.println("stack.isEmpty() = " + stack.isEmpty());
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
    }
}

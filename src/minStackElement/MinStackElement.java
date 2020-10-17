package minStackElement;

/*
    Problem: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinStackElement
{
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(9);
        obj.push(1);
        obj.push(2);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println(obj.getMin());
    }
}

class MinStack {

    /** initialize your data structure here. */
    private List<Integer> stack = new LinkedList<>();

    public MinStack() {}

    public void push(int x) {
        stack.add(0, x);
    }

    public void pop() {
        stack.remove(0);
    }

    public int top() {
        return stack.get(0);
    }

    public int getMin() {
        return Collections.min(stack);
    }
}

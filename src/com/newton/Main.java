package com.newton;

import com.newton.resources.Stack;
import com.newton.resources.StackCell;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.add(new StackCell("1"));
        stack.add(new StackCell("2"));

        stack.print();
    }
}

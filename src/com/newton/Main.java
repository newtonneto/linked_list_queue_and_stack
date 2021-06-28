package com.newton;

import com.newton.exceptions.EmptyStackException;
import com.newton.resources.Stack;
import com.newton.resources.StackCell;
import com.newton.tests.StackTest;

public class Main {

    public static void main(String[] args) {
        StackTest stackTest = new StackTest();

        try {
            stackTest.executeTestOne();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }

        try {
            stackTest.executeTestTwo();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }

        try {
            stackTest.executeTestThree();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }

        try {
            stackTest.executeTestFour();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }
    }
}

package com.newton.tests;

import com.newton.interfaces.IStackTest;
import com.newton.resources.Stack;
import com.newton.resources.Cell;

public class StackTest implements IStackTest {
    Stack stack;

    public StackTest() {
        this.stack = new Stack();
    }


    @Override
    public void executeTestOne() {
        //Adiciona 5 elementos
        this.stack.add(new Cell("1"));
        this.stack.add(new Cell("2"));
        this.stack.add(new Cell("3"));
        this.stack.add(new Cell("4"));
        this.stack.add(new Cell("5"));

        //Exibe toda a pilha e o seu tamanho
        this.stack.print();
        System.out.println("Tamanho da pilha: " + this.stack.getSize());

        //Remove um elemento
        System.out.println("Elemento removido: " + this.stack.removeNext().getElement().toString());

        //Exibe toda a pilha
        this.stack.print();

        //Remove mais elementos
        System.out.println("Elemento removido: " + this.stack.removeNext().getElement().toString());
        System.out.println("Elemento removido: " + this.stack.removeNext().getElement().toString());
        System.out.println("Elemento removido: " + this.stack.removeNext().getElement().toString());

        //Exibe toda a pilha
        this.stack.print();

        //Remove o único elemento da pilha
        System.out.println("Elemento removido: " + this.stack.removeNext().getElement().toString());

        //Exibe toda a pilha
        this.stack.print();
    }

    @Override
    public void executeTestTwo() {
        this.stack.getFirst();
    }

    @Override
    public void executeTestThree() {
        this.stack.getLast();
    }

    @Override
    public void executeTestFour() {
        this.stack.removeNext();
    }
}

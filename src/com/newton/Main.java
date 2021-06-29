package com.newton;

import com.newton.exceptions.EmptyQueueException;
import com.newton.exceptions.EmptyStackException;
import com.newton.tests.QueueTest;
import com.newton.tests.StackTest;

public class Main {

    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        QueueTest queueTest = new QueueTest();

        System.out.println("Iniciando teste 1 de pilha: Adição e Remoção");
        try {
            stackTest.executeTestOne();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 2 de pilha: Exibição do Primeiro Elemento com Pilha Vazia");
        try {
            stackTest.executeTestTwo();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 3 de pilha: Exibição do Ultimo Elemento com Pilha Vazia");
        try {
            stackTest.executeTestThree();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 4 de pilha: Remoção de Elemento com Pilha Vazia");
        try {
            stackTest.executeTestFour();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 1 de fila: Adição e Remoção");
        try {
            queueTest.executeTestOne();
        } catch (EmptyQueueException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 2 de fila: Exibição do Primeiro Elemento com Pilha Vazia");
        try {
            queueTest.executeTestTwo();
        } catch (EmptyQueueException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 3 de fila: Exibição do Ultimo Elemento com Pilha Vazia");
        try {
            queueTest.executeTestThree();
        } catch (EmptyQueueException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 4 de fila: Remoção de Elemento com Pilha Vazia");
        try {
            queueTest.executeTestFour();
        } catch (EmptyQueueException error) {
            System.out.println(error);
        }
    }
}

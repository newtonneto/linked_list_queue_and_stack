package com.newton;

import com.newton.exceptions.EmptyException;
import com.newton.tests.QueueTest;
import com.newton.tests.StackTest;

public class Main {

    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        QueueTest queueTest = new QueueTest();

        System.out.println("Iniciando teste 1 de pilha: Adição e Remoção");
        try {
            stackTest.executeTestOne();
        } catch (EmptyException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 2 de pilha: Exibição do Primeiro Elemento com Pilha Vazia");
        try {
            stackTest.executeTestTwo();
        } catch (EmptyException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 3 de pilha: Exibição do Ultimo Elemento com Pilha Vazia");
        try {
            stackTest.executeTestThree();
        } catch (EmptyException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 4 de pilha: Remoção de Elemento com Pilha Vazia");
        try {
            stackTest.executeTestFour();
        } catch (EmptyException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 1 de fila: Adição e Remoção");
        try {
            queueTest.executeTestOne();
        } catch (EmptyException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 2 de fila: Exibição do Primeiro Elemento com Pilha Vazia");
        try {
            queueTest.executeTestTwo();
        } catch (EmptyException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 3 de fila: Exibição do Ultimo Elemento com Pilha Vazia");
        try {
            queueTest.executeTestThree();
        } catch (EmptyException error) {
            System.out.println(error);
        }

        System.out.println("Iniciando teste 4 de fila: Remoção de Elemento com Pilha Vazia");
        try {
            queueTest.executeTestFour();
        } catch (EmptyException error) {
            System.out.println(error);
        }
    }
}

package com.newton.tests;

import com.newton.interfaces.IQueueTest;
import com.newton.resources.Queue;
import com.newton.resources.QueueCell;

public class QueueTest implements IQueueTest {
    Queue queue;

    public QueueTest() {
        this.queue = new Queue();
    }

    @Override
    public void executeTestOne() {
        //Adiciona 5 elementos
        queue.add(new QueueCell("1"));
        queue.add(new QueueCell("2"));
        queue.add(new QueueCell("3"));
        queue.add(new QueueCell("4"));
        queue.add(new QueueCell("5"));

        //Exibe toda a pilha e o seu tamanho
        queue.print();
        System.out.println("Tamanho da pilha: " + this.queue.size());

        //Remove um elemento
        System.out.println("Elemento removido: " + this.queue.removeNext().getElement().toString());

        //Exibe toda a pilha
        this.queue.print();

        //Remove 2 elementos e adiciona 1
        queue.removeNext();
        queue.add("6");
        queue.removeNext();

        //Exibe toda a pilha
        this.queue.print();

        //Remove 2 elementos
        queue.removeNext();
        queue.removeNext();

        //Exibe toda a pilha
        this.queue.print();

        //Remove o único elemento da fila
        queue.removeNext();

        //Exibe toda a pilha
        this.queue.print();
    }

    @Override
    public void executeTestTwo() {
        this.queue.first();
    }

    @Override
    public void executeTestThree() {
        this.queue.last();
    }

    @Override
    public void executeTestFour() {
        this.queue.removeNext();
    }
}

package com.newton.resources;

import com.newton.exceptions.EmptyQueueException;
import com.newton.interfaces.IQueue;

public class Queue implements IQueue {
    private QueueCell first_cell;
    private QueueCell last_cell;
    private int queue_size;

    public Queue() {
        this.first_cell = null;
        this.last_cell = null;
        this.queue_size = 0;
    }

    @Override
    public void add(Object o) {
        QueueCell cell = new QueueCell(o);

        if (this.isEmpty()) {
            this.first_cell = cell;
        } else {
            this.last_cell.setNext(cell);
        }

        this.last_cell = cell;
        this.queue_size++;
    }

    @Override
    public QueueCell removeNext() throws EmptyQueueException {
        if (this.isEmpty()) {
            throw new EmptyQueueException("removeNext(): Fila vazia");
        }

        //Atualiza o tamanho da fila
        this.queue_size--;
        //Salva a referencia do primeiro nó, o que será apagado
        QueueCell removed_cell = this.first_cell;

        //Se o tamanho da fila voltar a ser 0, a referencia ao primeiro e ultimo nó tem que ser null
        if (this.queue_size == 0) {
            this.first_cell = null;
            this.last_cell = null;
        } else {
            //Recebe a referencia do novo primeiro nó
            QueueCell wanted_cell = removed_cell.getNext();
            //Define o nove primeiro nó
            this.first_cell = wanted_cell;
            //Remove a referencia do nó seguindo do nó apagado
            removed_cell.setNext(null);
        }

        return removed_cell;
    }

    @Override
    public QueueCell first() throws EmptyQueueException {
        if (this.isEmpty()) {
            throw new EmptyQueueException("first(): Fila vazia");
        }

        return this.first_cell;
    }

    @Override
    public QueueCell last() throws EmptyQueueException {
        if (this.isEmpty()) {
            throw new EmptyQueueException("last(): Fila vazia");
        }

        return this.last_cell;
    }

    @Override
    public boolean isEmpty() {
        return this.queue_size == 0;
    }

    @Override
    public int size() {
        return this.queue_size;
    }

    @Override
    public void print() {
        QueueCell next_cell = this.first_cell;

        System.out.print("[");
        for (int index = 0; index < queue_size; index++) {
            System.out.print(" " + next_cell.getElement().toString() + " ");
            next_cell = next_cell.getNext();
        }
        System.out.println("]");
    }
}

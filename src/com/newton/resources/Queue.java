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

    }

    @Override
    public QueueCell removeNext() throws EmptyQueueException {
        return null;
    }

    @Override
    public QueueCell first() throws EmptyQueueException {
        return null;
    }

    @Override
    public QueueCell last() throws EmptyQueueException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void print() {

    }
}

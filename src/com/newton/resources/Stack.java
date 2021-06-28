package com.newton.resources;

import com.newton.exceptions.EmptyStackException;
import com.newton.interfaces.IStack;

public class Stack implements IStack {
    private StackCell first_cell;
    private StackCell last_cell;
    private int stack_size;

    public Stack() {
        this.first_cell = null;
        this.last_cell = null;
        this.stack_size = 0;
    }

    @Override
    public void add(Object o) {
        StackCell cell = new StackCell(o);

        if (isEmpty()) {
            this.first_cell = cell;
        } else {
            this.last_cell.setNext(cell);
        }

        this.last_cell = cell;
        this.stack_size++;
    }

    @Override
    public StackCell removeNext() throws EmptyStackException {
        return null;
    }

    @Override
    public StackCell first() throws EmptyStackException {
        return this.first_cell;
    }

    @Override
    public StackCell last() throws EmptyStackException {
        return this.last_cell;
    }

    @Override
    public boolean isEmpty() {
        return this.stack_size == 0;
    }

    @Override
    public void print() {
        if (!this.isEmpty()) {
            StackCell next_cell = this.first_cell;

            System.out.print("[");
            for (int index = 0; index < stack_size; index++) {
                System.out.print(" " + next_cell.getElement().toString() + " ");
                next_cell = next_cell.getNext();
            }
            System.out.println("]");
        }
    }
}

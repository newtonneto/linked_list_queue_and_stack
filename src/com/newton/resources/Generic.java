package com.newton.resources;

import com.newton.exceptions.EmptyException;
import com.newton.interfaces.IGeneric;

public class Generic implements IGeneric {
    private Cell first_cell;
    private Cell last_cell;
    private int length;

    public Generic() {
        this.first_cell = null;
        this.last_cell = null;
        this.length = 0;
    }

    @Override
    public void add(Object o) {
        Cell cell = new Cell(o);

        if (this.isEmpty()) {
            this.first_cell = cell;
        } else {
            this.last_cell.setNext(cell);
        }

        this.last_cell = cell;
        this.length++;
    }

    @Override
    public Cell getFirst() throws EmptyException {
        if (this.isEmpty()) {
            throw new EmptyException("first(): Estrutura vazia");
        }

        return this.first_cell;
    }

    @Override
    public void setFirst(Cell o) {
        this.first_cell = o;
    }

    @Override
    public Cell getLast() throws EmptyException {
        if (this.isEmpty()) {
            throw new EmptyException("last(): Estrutura vazia");
        }

        return this.last_cell;
    }

    @Override
    public void setLast(Cell o) {
        this.last_cell = o;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public int getSize() {
        return this.length;
    }

    @Override
    public void setSize(int i) {
        this.length = i;
    }

    @Override
    public void print() {
        Cell next_cell = this.first_cell;

        System.out.print("[");
        for (int index = 0; index < length; index++) {
            System.out.print(" " + next_cell.getElement().toString() + " ");
            next_cell = next_cell.getNext();
        }
        System.out.println("]");
    }
}

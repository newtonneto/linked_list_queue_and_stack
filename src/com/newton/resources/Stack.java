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
        if (this.isEmpty()) {
            throw new EmptyStackException("removeNext(): Pilha vazia");
        }

        StackCell removed_cell = this.last_cell;
        //Vai armazenar o penultimo nó
        StackCell wanted_cell = this.first_cell;

        for (int index = 1; index < this.stack_size - 1; index++) {
            wanted_cell = wanted_cell.getNext();
        }

        //Apaga o conteudo armazenado pelo ultimo nó
        //this.last_cell.setElement(null);
        //Salva o novo tamanho ta lista
        this.stack_size--;

        //Se o tamanho da pilha voltar a ser 0, a referencia ao primeiro e ultimo nó tem que ser null
        if (this.stack_size == 0) {
            this.first_cell = null;
            this.last_cell = null;
        } else {
            //Remove a referecia do ultimo nó no penultimo nó
            wanted_cell.setNext(null);
            //Salva o penultimo nó como o novo último nó
            this.last_cell = wanted_cell;
        }

        return removed_cell;
    }

    @Override
    public StackCell first() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException("first(): Pilha vazia");
        }

        return this.first_cell;
    }

    @Override
    public StackCell last() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException("last(): Pilha vazia");
        }

        return this.last_cell;
    }

    @Override
    public boolean isEmpty() {
        return this.stack_size == 0;
    }

    @Override
    public int size() {
        return this.stack_size;
    }

    @Override
    public void print() {
        StackCell next_cell = this.first_cell;

        System.out.print("[");
        for (int index = 0; index < stack_size; index++) {
            System.out.print(" " + next_cell.getElement().toString() + " ");
            next_cell = next_cell.getNext();
        }
        System.out.println("]");
    }
}

package com.newton.resources;

import com.newton.exceptions.EmptyException;
import com.newton.interfaces.IStack;

public class Stack extends Generic implements IStack {
    public Stack() {
        super();
    }

    @Override
    public Cell removeNext() throws EmptyException {
        if (this.isEmpty()) {
            throw new EmptyException("removeNext(): Pilha vazia");
        }

        Cell removed_cell = super.getLast();
        //Vai armazenar o penultimo nó
        Cell wanted_cell = super.getFirst();

        for (int index = 1; index < super.getSize() - 1; index++) {
            wanted_cell = wanted_cell.getNext();
        }

        //Apaga o conteudo armazenado pelo ultimo nó
        //this.last_cell.setElement(null);
        //Salva o novo tamanho ta lista
        super.setSize(super.getSize() - 1);

        //Se o tamanho da pilha voltar a ser 0, a referencia ao primeiro e ultimo nó tem que ser null
        if (super.getSize() == 0) {
            super.setFirst(null);
            super.setLast(null);
        } else {
            //Remove a referecia do ultimo nó no penultimo nó
            wanted_cell.setNext(null);
            //Salva o penultimo nó como o novo último nó
            super.setLast(wanted_cell);
        }

        return removed_cell;
    }
}

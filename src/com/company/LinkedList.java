package com.company;

class LinkedList<T> {
    private Node<T> head;
    private Node last;

    LinkedList(T element) {
        this.head = new Node<>(element);
        this.last = null;
    }

    LinkedList() {
        this.head = null;
        this.last = null;
    }

    LinkedList add(T element) {
        if (head == null) {
            this.head = new Node<>(element);
        } else if (last == null) {
            last = head.setNext(element);
        } else {
            last = last.setNext(element);
        }
        return this;
    }

    String printList() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = this.head;
        while (current.getNext()!=null) {
            stringBuilder.append(current.getElement());
            stringBuilder.append(" ");
            current = current.getNext();
        }
        stringBuilder.append(current.getElement());
        return stringBuilder.toString();
    }

    T findMidTerm() {
        Node start = this.head;
        Node midTerm = this.head;

        while (start.getNext()!=null) {
            start = start.getNext().getNext();
            midTerm = midTerm.getNext();
        }
        return (T) midTerm.getElement();
    }

}

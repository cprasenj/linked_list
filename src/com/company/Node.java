package com.company;

class Node <T>{
    private T element;
    private Node<T> next;

    Node(T element) {
        this.element = element;
        this.next = null;
    }

    T getElement() {
        return element;
    }

    Node setNext(T next) {
        this.next = new Node<>(next);
        return this.next;
    }

    Node getNext() {
        return this.next;
    }
}

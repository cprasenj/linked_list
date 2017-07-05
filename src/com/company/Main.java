package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.printList());

        LinkedList list1 = new LinkedList("pooja");
        list1.add("parsenjit");
        System.out.println(list1.printList());

        LinkedList list2 = new LinkedList(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println(list2.findMidTerm());

    }
}

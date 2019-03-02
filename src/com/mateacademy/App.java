package com.mateacademy;

public class App {

    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());

        MyList<String> list1 = new MyLinkedList<>();
        list1.add("first");
        list1.add("second");
        list1.add("third");
        list1.add("fourth");

        list1.remove(3);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.size());
    }
}

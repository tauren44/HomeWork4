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

        MyMap<Integer, String> map = new MyHashMap<>();
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "third");
        map.remove(2);
        System.out.println(map.get(1));
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());

        System.out.println("-------------------------------------");
        MyStack<String> stack = new MyStackArray<>();
        stack.add("first");
        stack.add("second");
        stack.add("third");
        stack.add("fourth");

        System.out.println(stack.size());

        System.out.println(stack.peek());
        System.out.println(stack.size());

        stack.remove();
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.clear();
        System.out.println(stack.size());
    }
}

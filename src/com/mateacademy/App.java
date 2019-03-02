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
    }
}

package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < rnd.nextInt(8)+3; i++) {
            linkedList.add(rnd.nextInt(10));
        }
        System.out.println("Размер списка: "+linkedList.size());
        System.out.println("Исходный:      "+linkedList);
        Collections.reverse(linkedList);
        System.out.println("После реверса: "+linkedList);
    }
}
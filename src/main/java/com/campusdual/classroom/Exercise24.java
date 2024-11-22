package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {

        Queue<String> cola = new LinkedList<>();

        cola.add("Smith");
        cola.add("Montessori");
        cola.add("Peralta");
        cola.add("House");

        return cola;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {

        for(String str : queue){
            System.out.println(str);
        }

    }

    public static void main(String[] args) {

    }

}

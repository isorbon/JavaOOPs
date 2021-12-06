package com.syntax.class26.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");

        Iterator<String> iterator = subjects.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        iterator.remove();

    }
}

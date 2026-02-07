package org.itmo.lab8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //case1

        List<String> list = Arrays.asList("a", "b", "a", "b", "c", "g", "f");

        System.out.println(removeDuplicates(list));
    }

    //case1

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {

        return new HashSet<>(collection);
    }
}
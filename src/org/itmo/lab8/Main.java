package org.itmo.lab8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //case1

        List<String> list = Arrays.asList("a", "b", "a", "b", "c", "g", "f");

        System.out.println(removeDuplicates(list));

        //case2

        List<Integer> arrayList = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {

            arrayList.add(i);

            linkedList.add(i);

        }

        //System.out.println(arrayList);  уууупппссссс;)

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            arrayList.get(random.nextInt(1000000));
        }

        long arrayListTime = System.currentTimeMillis() - start;

        System.out.println("ArrayList: " + arrayListTime + " милисекунд.");

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            linkedList.get(random.nextInt(1000000));
        }

        long linkedListTime = System.currentTimeMillis() - start1;

       System.out.println("LinkedList: " + linkedListTime + " милисекунд.");

        //case3

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя: ");

        String userName = scanner.nextLine();

        User user = new User(userName);

        System.out.println("Создан пользователь: " + user.getName());
    }

    //case1

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {

        return new HashSet<>(collection);
    }


    //case3

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
package org.itmo.lab8;

//залито заново

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



        //case3

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя: ");

        String userName = scanner.nextLine();

        User user = new User(userName);

        System.out.println("Создан пользователь: " + user.getName());

        //case4

        Map<User, Integer> scores = new HashMap<>();

        scores.put(new User("Иван"), 100);

        scores.put(new User("Петр"), 200);

        scores.put(new User("Сидор"), 300);

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Введите имя игрока: ");

        String name = scanner1.nextLine();

        for (Map.Entry<User, Integer> entry : scores.entrySet()) {

            if (entry.getKey().getName().equals(name)) {

                System.out.println("Очков: " + entry.getValue());

                return;
            }
        }

        System.out.println("Такого игрока нет!!!");
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
package org.itmo.lab1.lab3;

public class Tree {

    private int age;

    private boolean alive;

    private String name;

    public Tree(int age, String name){

        this.age = age;

        this.name = name;
    }

    public Tree(int age, boolean alive, String name){

        this.age = age;

        this.alive = alive;

        this.name = name;
    }

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал!");
    }

    public void printInfo(){

        System.out.println(age + " " + alive + " " + name);

        System.out.println();
    }
}

class Main2 {

    public static void main(String[] args){

        Tree tree1 = new Tree(100, "Дуб");

        tree1.printInfo();

        Tree tree2 = new Tree(25, true, "Берёза");

        tree2.printInfo();

        Tree tree3 = new Tree();

        tree3.printInfo();
    }
}
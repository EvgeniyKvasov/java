package org.itmo.lab1.lab3;

public class House {

    private int floor;

    private int year;

    private String name;


    public void setAllValues(int floor, int year, String name){

        this.floor = floor;

        this.year = year;

        this.name = name;
    }

    public void printAllValues(){

        System.out.print(this.floor + " " + this.year + " " + this.name + " " + getYearFromPast());

        System.out.println();
    }

    public int getYearFromPast(){

        return 2026-year;
    }
}

class Main1 {

    public static void main(String[] args){

        House house1 = new House();

        House house2 = new House();

        house1.setAllValues(16, 2008, "Беринг");

        house2.setAllValues(7, 1907, "Чкаловский");

        house1.printAllValues();

        house2.printAllValues();
    }
}




package com.company;

public class Specialist extends Employee {

    private int levels;

    public Specialist(String name, int age, double salary, int levels) {
        super(name, age, salary);
        this.levels = levels;
    }

    public Specialist() {

    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    public void workWithClients(){

        System.out.println("I am talking to client through mobile phone!");

    }


    @Override
    public void print(){

        System.out.println("Speciaist's name: " + super.getName());
        System.out.println("Speciaist's age: " + super.getAge());
        System.out.println("Speciaist's salary: " + super.getSalary());
        System.out.println("Speciaist's level: " + levels);
        workWithClients();

        System.out.println();
    }
}

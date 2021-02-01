package com.company;

public class Manager extends Employee{

    boolean hasStocks;

    public Manager(String name, int age, double salary, boolean hasStocks) {
        super(name, age, salary);
        this.hasStocks = hasStocks;
    }

    public Manager() {

    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
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

    public void writeProcedures() {

        System.out.println("I am developing new procedure!");
    }

    public void print(){

        System.out.println("Manager's name: " + super.getName());
        System.out.println("Manager's age: " + super.getAge());
        System.out.println("Manager's salary: " + super.getSalary());
        System.out.println("Manager has stocks: " + hasStocks);
        writeProcedures();

        System.out.println();
    }
}

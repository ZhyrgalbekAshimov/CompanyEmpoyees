package com.company;

public class CEO extends Employee{

    boolean hasCompanyCar;

    public CEO(String name, int age, double salary, boolean hasCompanyCar) {
        super(name, age, salary);
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO() {

    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
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

    public  void goPublic(){

        System.out.println("Company is going upon IPO!");

    }

    public void print(){

        System.out.println("CEO's name: " + super.getName());
        System.out.println("CEO's age: " + super.getAge());
        System.out.println("CEO's salary: " + super.getSalary());
        System.out.println("CEO has a company car: " + hasCompanyCar);
        goPublic();

        System.out.println();
    }
}

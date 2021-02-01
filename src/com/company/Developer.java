package com.company;

public class Developer extends Employee{

    private String grades;

    public Developer(String name, int age, double salary, String grades) {
        super(name, age, salary);
        this.grades = grades;
    }

    public Developer() {

    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
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

    public void writeCode() {

        System.out.println("I've been coding since last week!");
    }

    public void print(){

        System.out.println("Developers's name: " + super.getName());
        System.out.println("Developers's age: " + super.getAge());
        System.out.println("Developers's salary: " + super.getSalary());
        System.out.println("Developer's grade: " + grades);
        writeCode();

        System.out.println();
    }
}

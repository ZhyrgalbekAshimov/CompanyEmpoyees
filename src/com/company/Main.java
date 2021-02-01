package com.company;

public class Main {

    public static void main(String[] args) {

        Specialist specialist1 = new Specialist("Zhyrgal", 25, 20000, 2);
        Specialist specialist2 = new Specialist("Aibek", 30, 30000, 3);
        Specialist specialist3 = new Specialist("Nurbek", 40, 50000, 5);

        Developer developer1 = new Developer("Mirbek", 30, 20000, "Middle");
        Developer developer2 = new Developer("Ainura", 26, 32000, "Senior");
        Developer developer3 = new Developer("Maksat", 36, 45000, "Middle");
        Developer developer4 = new Developer("Artur", 44, 30000, "Junior");

        Manager manager1 = new Manager("Maksim", 42, 60000, true);
        Manager manager2 = new Manager("Bakyt", 55, 65000, false);

        CEO ceo1 = new CEO("Tilek", 69, 70000, true);

        specialist1.print();
        specialist2.print();
        specialist3.print();

        developer1.print();
        developer2.print();
        developer3.print();
        developer4.print();

        manager1.print();
        manager2.print();

        ceo1.print();

    }
}

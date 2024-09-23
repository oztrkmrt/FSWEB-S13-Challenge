package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan healthplan1 = new Healthplan(1, "Basic Plan", Plan.BASIC);
        System.out.println(healthplan1);

        String[] employeePlans = new String[2];
        Employee employee1 = new Employee(11,"John Doe", "doeJohn@email.com","358", employeePlans);
        employee1.addHealthPlan(0,"Employee Basic Plan");
        employee1.addHealthPlan(1,"Employee Premium Plan");
        System.out.println(employee1);

        String[] developers = new String[2];
        Company company1 = new Company(101, "Work", 10000, developers);
        company1.addEmployee(0,"Mert");
        company1.addEmployee(1,"Ozturk");
    }
}
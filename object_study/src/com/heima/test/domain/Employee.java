package com.heima.test.domain;

public class Employee {
    private String name;
    private String section;
    private double salary;
    private String grade;

    public Employee() {
    }

    public Employee(String name, String section, double salary, String grade) {
        this.name = name;
        this.section = section;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

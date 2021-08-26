package com.heima.test;

import com.heima.test.domain.Employee;

import java.util.ArrayList;
import java.util.Date;

public class EmployeeArrList {

    public static void main(String[] args) {

        Employee emp1 = new Employee("张三","设计部",2000,"A");
        Employee emp2 = new Employee("李四","广告部",2000,"B");
        Employee emp3 = new Employee("王五","运营部",2100,"A");
        Employee emp4 = new Employee("JULY","销售部",20000,"B");
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        System.out.println("姓名\t部门\t工资\t评级");
        for (int i = 0; i < empList.size(); i++) {
            Employee emp =  empList.get(i);
            System.out.println(emp.getName()+"\t"+emp.getSection()+"\t"+emp.getSalary()*0.8+"\t"+emp.getGrade());
        }
        for (int i = 0; i < empList.size(); i++) {
            if ("b".equalsIgnoreCase(empList.get(i).getGrade())){
                empList.get(i).setSalary(empList.get(i).getSalary()-500.0);
            }
        }
        for (int i = 0; i < empList.size(); i++) {
            Employee emp =  empList.get(i);
            if ("b".equalsIgnoreCase(empList.get(i).getGrade())){
                System.out.println(emp.getName()+"\t"+emp.getSection()+"\t"+emp.getSalary()+"\t"+emp.getGrade());
            }

        }
    }
}

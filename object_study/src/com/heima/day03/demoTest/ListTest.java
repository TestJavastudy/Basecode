package com.heima.day03.demoTest;

import com.heima.day03.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
            beginStart();


    }

    private static void beginStart() {

        //声明一个集合存储学生
        ArrayList<Student> stulist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       lo: while (true){
        System.out.println("欢迎您进入学生管理系统");
        System.out.println("1代表需要添加学生");
        System.out.println("2代表需要修改学生信息");
        System.out.println("3代表需要删除学生");
        System.out.println("4代表需要查询学生信息");
        System.out.println("0退出系统");
        int type;
        type = sc.nextInt();
        switch (type){
            case 1:
                Addstudent(stulist);//添加学生
                break;
            case 2:
                replaceStu(stulist);//修改学生信息
                break;
            case 3:
                removeStudent(stulist);

                break;
            case 4:
                showStudent(stulist);
                break;
            case 0:
                System.out.println("感谢您的使用，期待与你再回");
                break lo ;
            default:
                System.out.println("您的选择有误，请重新输入");
                break;
        }
    }
    }

    private static void removeStudent(ArrayList<Student> stulist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除学生的学号：");
        String sno = sc.next();
        for (int i = 0; i < stulist.size(); i++) {
            if (sno.equals(stulist.get(i).getSno())){
                stulist.remove(i);
                break;
            }
            if (i == stulist.size()-1){
                System.out.println("您输入的学号有误，请核对学号是否正确");
            }
        }
    }

    private static void replaceStu(ArrayList<Student> stulist) {
        System.out.println("请输入需要修改学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sno = sc.next();
        for (int i = 0; i < stulist.size(); i++) {
            if (sno.equals(stulist.get(i).getSno())) {
                System.out.println("请输入新的名字:");
                String name = sc.next();
                stulist.get(i).setName(name);
                System.out.println(stulist.get(i).getName());
                System.out.println("请输入新的年龄:");
                int age = sc.nextInt();
                stulist.get(i).setAge(age);
                break;
            }
            if (i == stulist.size() - 1) {
                System.out.println("没有找到需要修改的学生，请核对学号后重新修改");
            }
        }
    }

    private static void showStudent(ArrayList<Student> stulist) {
        //判断集合中是否有元素
        if(stulist.isEmpty()){
            System.out.println("暂时未有学生的信息，请录入后查询");
        }else {
            System.out.println("学号\t\t姓名\t\t年龄\t\t");
            for (int i = 0; i < stulist.size(); i++) {
                System.out.println(stulist.get(i).getSno()+"\t"+ stulist.get(i).getName()+"\t"+stulist.get(i).getAge());
            }
        }

    }

    private static void Addstudent(ArrayList<Student> stulist) {
        Student stu  = new Student();
        //可以手动输入学生学号，姓名，年龄
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生学号：");
        String sno = sc.next();
        stu.setSno(sno);
        System.out.print("请输入学生姓名：");
        String name = sc.next();
        stu.setName(name);
        while (true){
            System.out.print("请输入学生年龄：");
            int age = sc.nextInt();
            if (age >=0 && age<=180){
                stu.setAge(age);
                break;
            }else {
                System.out.println("您输入的年龄有误，请重新输入一个有效的年龄");
            }
        }
        //判断如果系统中存在，则返回值告诉无法继续录入，需要更改学号
        if (stulist.isEmpty()){
            stulist.add(stu);
        }else{
            for (int i = 0; i < stulist.size(); i++) {
                if (sno.equals(stulist.get(i).getSno())){
                    System.out.println("您输入的学号在系统中存在，无法继续添加，若需要廷加，请更改学号");
                    break;
                }else {
                    stulist.add(stu);
                    break;
                }
            }
        }
    }
}

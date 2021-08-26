package com.heima.StuDemo;

import com.heima.StuDemo.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        //创建一个学生存储链表
        ArrayList<Student> stulist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       lo:while(true){
            System.out.println("请选择你需要的操作");
            System.out.println("1添加学生信息\t2删除学生信息");
            System.out.println("3修改学生信息\t4展示学生信息");
            System.out.println("0退出系统");
            System.out.println("请选择您的操作");
            int type = sc.nextInt();
            switch (type){
                case 1:
                    addStudent(stulist);
                    break;
                case 2:
                    removeStudent(stulist);
                    break;
                case 3:
                    replaceStudent(stulist);
                    break;
                case 4:
                    showStudent(stulist);
                    break;
                case 0:
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break ;
            }
        }
    }
    //添加学生方法
    public static void addStudent(ArrayList<Student> stulist){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号");
        String sno = sc.nextLine();
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        while (true){
            if (age >= 0 && age<=120 ){
                break;
            }else {
                System.out.println("请输入0-180的合法年龄：");
                age =sc.nextInt();
            }
        }
        Student stu = new Student(sno,name,age);
        if (stulist.isEmpty()){
            stulist.add(stu);
            System.out.println("添加信息成功");
        }else {
            for (int i = 0; i < stulist.size(); i++) {
                if (sno.equals(stulist.get(i).getSno())){
                    System.out.println("该学号在系统中有学员信息，请修改核对信息后重新输入");
                    break;
                }else {
                    stulist.add(stu);
                    System.out.println("添加信息成功");
                }
            }

        }


    }
    //修改学生信息方法
    public static void replaceStudent(ArrayList<Student> stulist){
        Scanner sc = new Scanner(System.in);
        //判断数据不为空
        if (stulist.isEmpty()){
            System.out.println("系统暂时没有学生信息，请录入学生信息后修改");
            return;
        }
        System.out.println("请输入修改学生信息学号：");
        String sno = sc.nextLine();
        //遍历对比学号信息，若存在，则修改，不存在，就返回学生信息不存在
        for (int i = 0; i < stulist.size(); i++) {
            String getSno = stulist.get(i).getSno();
            //存在
            if (sno.equals(getSno)){
                System.out.println("请输入学生姓名");
                String name = sc.nextLine();
                System.out.println("请输入学生年龄");
                int age = sc.nextInt();
                while (true){
                    if (age >= 0 && age<=120 ){
                        break;
                    }else {
                        System.out.println("请输入0-180的合法年龄：");
                        age =sc.nextInt();
                    }
                }
               stulist.get(i).setName(name);
               stulist.get(i).setAge(age);
                System.out.println("修改学生信息成功");
            }else {//不存在
                System.out.println("您输入的学生信息不存在，请核对后重新输入");
            }
        }

    }
    //删除学生信息算法
    public static void removeStudent(ArrayList<Student> stulist){
        if (stulist.isEmpty()){
            System.out.println("系统暂时没有学生信息，请录入学生信息后修改");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除学生信息的学号");
        String sno = sc.nextLine();
        for (int i = 0; i < stulist.size(); i++) {
            Student stu = stulist.get(i);
            if (sno.equals(stu.getSno())){
                stulist.remove(i);
                System.out.println("删除学生信息成功");
            }
            if (i == stulist.size()-1){
                System.out.println("系统中暂时没有该学号学生信息，请核对后重新输入");
            }
        }
    }
    //搜索学生信息
    public static  void showStudent(ArrayList<Student> stulist){
        if (stulist.isEmpty()){
            System.out.println("信息库暂时没有学生信息，请添加后查询");
        }else {
            System.out.println("学号\t\t姓名\t\t年龄");
            for (int i = 0; i < stulist.size(); i++) {
                Student stu = stulist.get(i);
                System.out.println(stu.getSno()+"\t"+stu.getName()+"\t"+stu.getAge());
            }
        }
    }
}

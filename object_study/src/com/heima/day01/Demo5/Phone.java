package com.heima.day01.Demo5;

/**
 * 定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
 *
 * 请定义出手机类，类中要有空参、有参构造方法，set/get方法。
 *
 * 定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
 */
public class Phone {
    private String brand;
    private double price;
    private  String color;
    //添加系统默认的构造方法
    public Phone() {
    }
    //添加带参数的构造方法
    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void call(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打电话....");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机发送短信....");
    }
}

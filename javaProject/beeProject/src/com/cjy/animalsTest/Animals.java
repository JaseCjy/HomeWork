package com.cjy.animalsTest;

import java.util.Scanner;

public class Animals {
    private String variety;
    private int age;
    private String sex;
    Scanner sc=new Scanner(System.in);
    public Animals() {
        System.out.println("请依次输入动物种类、年龄、性别:");

    }

    public String getVariety() {
        return variety;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {

        return "Animals{" +
                "variety='" + variety + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sc=" + sc +
                '}';
    }
}

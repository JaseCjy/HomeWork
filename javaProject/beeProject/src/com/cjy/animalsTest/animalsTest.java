package com.cjy.animalsTest;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

/*将动物信息（种类，性别，年龄）保存在集合中（可以先保存一部分，再添加新的；也可以后面录入。在
这里要不同的动物可能会有不同的属性）在控制台输入指令，系统可以对动物信息进行基本的增加、删除、修
改、查询、对年龄进行排序然后输出像C语言题库里面的那种菜单式的系统，如输入1进行...操作，输入2进行...操作
考察内容：面向对象，泛型，异常，集合*/
public class animalsTest {
    public static void main(String[] args) {

        System.out.println("欢迎来到动物管理系统！");
        Animals a = new Animals();
        Scanner sc = new Scanner(System.in);
        String variety = sc.next();
        int age = sc.nextInt();
        String sex = sc.next();
        a.setVariety(variety);
        a.setSex(sex);
        a.setAge(age);
        System.out.println("        动物管理系统");
        System.out.println("---------------------------");
        System.out.println("种类        年龄       性别");
        TreeSet set = new TreeSet();
        set.add(a.getVariety());
        set.add(a.getAge());
        set.add(a.getSex());
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"        ");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("输入1进行增加操作，输入2进行删除操作，输入3进行修改操作");
    }
}

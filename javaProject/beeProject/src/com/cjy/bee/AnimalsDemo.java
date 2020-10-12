package com.cjy.bee;

import java.util.*;

/*任务1：
将动物信息（种类，性别，年龄）保存在集合中（可以先保存一部分，再添加新的；也可以后面录入。在这里要不同的动物可能会有不同的属性）
在控制台输入指令，系统可以对动物信息进行基本的增加、删除、修改、查询、对年龄进行排序然后输出
像C语言题库里面的那种菜单式的系统，如输入1进行...操作，输入2进行...操作
考察内容：面向对象，泛型，异常，集合*/
public class AnimalsDemo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains("tom"));
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);

        }
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);
        List<Integer> list1 = Arrays.asList(123, 456);
        System.out.println(list1);
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = coll.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if ("tom".equals(obj)) {
                iterator.remove();
            }
        }
        iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object obj : coll) {
            System.out.println(obj);
        }//内部还是调用的迭代器Iterator
        String[] arr = new String[]{"MM","MM","MM"};
        for(String s:arr){
            s="gg";
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
    }
        }

                }


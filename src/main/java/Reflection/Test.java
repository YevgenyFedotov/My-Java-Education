package Reflection;

import QuickSort.QuickSort;
import StreamIO.StAX.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        System.out.println("int class name: " + intClass.getName());

        QuickSort quickSort = new QuickSort();
        Class<?> quickSortClass = quickSort.getClass();
        System.out.println("quickSort class name: " + quickSortClass.getName());

        try {
            Class<?> myClass = Class.forName("QuickSort.QuickSort");
            System.out.println("myClass class name: " + myClass.getSimpleName());

            System.out.println("Modifier: " + Modifier.toString(myClass.getModifiers()));
            System.out.println(myClass.getPackage());
            System.out.println("Methods:");
//            Method[] methods = myClass.getMethods(); //Только публичные и наследованные методы
            Method[] methods = myClass.getDeclaredMethods(); //Все объявленные методы(без наследованных)
            for (Method meth:
                 methods) {
                System.out.println(meth.getName());
            }
//            System.out.println('\n' + myClass.getMethod("isOneValue").getName()); //Приватный метод получить не смог
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Получил доступ к приватному полю и изменил его значение
        User user = new User(1, "ASD");
        try {
            Field idField = user.getClass().getDeclaredField("id");
            idField.setAccessible(true);
            System.out.println("Currend id: " + idField.getInt(user));
            idField.setInt(user, 2);
            System.out.println("New id: " + idField.getInt(user));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        //Выполнил приватный метод класса User
        try {
            Method doMethod = user.getClass().getDeclaredMethod("doSomething", String.class);
            doMethod.setAccessible(true);
            doMethod.invoke(user, "eat");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

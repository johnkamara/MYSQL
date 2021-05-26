package com.ubuntutest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


interface Cap{


    public void coopon(String stout, String beer);
}

public class Main {

    public static void main(String[] args) {
        
        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is Line %d\n", 3);
        }).start();

        RegExpressions reg = new RegExpressions();
        System.out.println("this is a regExp " +reg.matcher.matches());
         Cap cap = (String stout, String beer)-> System.out.println("okay i need " + stout + " and " + beer);
         cap.coopon ("Code's stout",  "Becks");



        Employee john = new Employee("John Abdul", 37);
        Employee gibo = new Employee("Gibo Kanu", 28);
        Employee momo = new Employee("Momoh Sesay", 35);
        Employee edward = new Employee("Edward Thornoka", 35);
        Employee kadi = new Employee("Kadijatu Bah", 26);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(gibo);
        employees.add(momo);
        employees.add(edward);
        employees.add(kadi);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());

            }

        });
        for (Employee employee: employees){
            System.out.println(employee.getName());
        }

    }
}

class Employee{
    private String Name;
    private int age;

    public Employee(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//class CodeToRun implements Runnable{
//    @Override
//    public void run() {
//      //  System.out.println("Printing from the Runnable");
//    }
//}

package org.Stream.MethodReferencePart2.empolyee;

import java.util.Objects;

public class Employee {

    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
 int i =0;
 int j =0;

    @Override
    public boolean equals(Object o) {
        int i =0;
        i= ++i;
        System.out.println("Employee equals called"+" "+(i));
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        j = ++j;
        System.out.println("Employee hashCode called"+" "+(j));
        return Objects.hash(name, id);
    }

    public  Employee(){}

    public  Employee(int id){
        this.id=id;
    }

    public  Employee(String name){
        this.name=name;
    }

    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }
}

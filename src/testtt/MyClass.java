package testtt;

import java.util.ArrayList;

public class MyClass {
    private String name;
    private ArrayList<String> courses =new ArrayList<String >();
    public static  MyClass mClass = new MyClass();
     MyClass(String name) {
        this.name = name;
    }
    MyClass(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addData(String c) {
        this.courses.add(c);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}

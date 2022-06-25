import testtt.MyClass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class School implements Serializable {

//    public  Manager manager;
    public  ArrayList<Manager> managers= new ArrayList<Manager>();
    public  ArrayList<Teacher> teachers= new ArrayList<Teacher>();
    public  ArrayList<Student> students= new ArrayList<Student>();
    public  ArrayList<Subject> subjects= new ArrayList<Subject>();
    public static School mSchool = new School();

    public  void addStudent(Student student){
        students.add(student);
    }
    public  void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public  void addSubject(Subject subject){
        subjects.add(subject);
    }

    public  String showData(){
        return "School { manager : "+managers + "\n ,teachers :"+teachers + "\n ,students :"+students + "\n ,subjects :"+subjects +" } "  ;
    }

}

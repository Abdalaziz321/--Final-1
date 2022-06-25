import java.io.Serializable;
import java.util.ArrayList;

public class Subject implements Serializable {
    private String name ;
    private ArrayList<Teacher> teachers= new ArrayList<Teacher>();
    private ArrayList<Student> students= new ArrayList<Student>();
    Subject(String name){
        this.name = name;
    }

    public Subject(String name, ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }
}

import java.io.Serializable;

public class Teacher extends Employee implements Serializable {
    private int coursesCount ;
    public Teacher(String id,String name ,  String address, String phone, String email, double baseSalary, double liveExpisive, String password,int coursesCount) {
        super(id, name ,address, phone, email, baseSalary, liveExpisive, password);
        this.coursesCount=coursesCount;
    }

    public int getCoursesCount() {
        return coursesCount;
    }

    public void setCoursesCount(int coursesCount) {
        this.coursesCount = coursesCount;
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "coursesCount=" + coursesCount +
                "} " + super.toString();
    }
}

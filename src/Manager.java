import java.io.Serializable;

public class Manager extends Employee implements Serializable {
    private double managerBoinus;

    public Manager() {
    }

    public Manager(String id,String name, String address, String phone, String email, double baseSalary, double liveExpisive, String password, double managerBoinus) {
        super(id,name , address, phone, email, baseSalary, liveExpisive, password);
        this.managerBoinus=managerBoinus;
    }
    public Manager(String id,String name, String address, String phone, String email, double baseSalary, double liveExpisive, String password) {
        super(id,name , address, phone, email, baseSalary, liveExpisive, password);

    }

    @Override
    public double getSalary() {
        return getBaseSalary() * (managerBoinus/100);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                ", liveExpisive=" + getLiveExpisive() +
                ", password='" + getPassword() + '\'' +
                "managerBoinus=" + managerBoinus +
                "} ";
    }
}

import java.io.Serializable;

public abstract class Employee implements Serializable {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private double baseSalary;
    private double liveExpisive;
    private String password;

    public Employee() {
    }

    public  Employee(String id,String name , String address, String phone, String email, double baseSalary, double liveExpisive, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.baseSalary = baseSalary;
        this.liveExpisive = liveExpisive;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getLiveExpisive() {
        return liveExpisive;
    }

    public void setLiveExpisive(double liveExpisive) {
        this.liveExpisive = liveExpisive;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", baseSalary=" + baseSalary +
                ", liveExpisive=" + liveExpisive +
                ", password='" + password + '\'' +
                '}';
    }
}

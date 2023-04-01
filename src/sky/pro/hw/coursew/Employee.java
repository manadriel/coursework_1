package sky.pro.hw.coursew;

public class Employee {
    private String fullName;
    private int unit;
    private double salary;
    private long id;
    private static long nextID;
    public Employee(String fullName, int unit, double salary) {
        this.fullName = fullName;
        this.unit = unit;
        this.salary = salary;
        this.id = nextID++;
    }
    public String getFullName() {
        return fullName;
    }
    public int getUnit() {
        return unit;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setUnit(int unit) {
        if (unit > 0 && unit <= 5) {
            this.unit = unit;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", unit=" + unit +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}

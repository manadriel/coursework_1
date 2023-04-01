package sky.pro.hw.coursew;

public class test {
    static Employee[] employees = new Employee[10];
    public static void main(String[]  args) {
        printAll();
    }
    public static void printAll()  {
       for (Employee employee : employees) {
           System.out.println(employee);

       }
    }
}

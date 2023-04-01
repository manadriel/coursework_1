package sky.pro.hw.coursew;

public class test {
    static Employee[] employees = new Employee[10];
    public static void main(String[]  args) {
        employees[0] = new Employee("Друзь Александр Сергеевич", 2, 69000);
        employees[1] = new Employee("Карельский Христя Мариевич", 3, 74500);
        employees[2] = new Employee("Фир Амнезия Пенумбровна", 4, 32200);
        employees[3] = new Employee("Листерин Вадим Каренович", 1, 108600);
        employees[4] = new Employee("Мамик Семен Альеризоиевич", 3, 74050);
        employees[5] = new Employee("Росянка Мария Филаретовна", 5, 232800);
        employees[6] = new Employee("Данильченко Зевс Павлович", 4, 50000);
        employees[7] = new Employee("Лебедева Леда Сергеевна", 1, 56000);
        employees[8] = new Employee("Гренкин Александр Константинович", 5, 64000);
        employees[9] = new Employee("Макипоро Асылхан Кириевич", 1, 18000);
        printAll();
        System.out.println("Сумма зарплат =  " + salarySum());
        System.out.println("Сотрудник с минимальной зарплатой = " + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой = " + maxSalary());
        System.out.println("Средняя зарплата " + middleSalary());
        printNameEmployees();



        }
    public static void printAll()  {
       for (Employee employee : employees) {
           System.out.println(employee);
       }
    }
    public static double salarySum(){
        double salary = 0.0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary;
    }
    public static Employee minSalary() {
        Employee min = null;
        for (Employee employee: employees) {
            if (min ==null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    public static Employee maxSalary() {
        Employee max = null;
        for (Employee employee: employees) {
            if (max ==null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    public static double middleSalary() {
        return salarySum() / employees.length;
    }
    public static void  printNameEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

}

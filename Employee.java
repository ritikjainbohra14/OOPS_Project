public class Employee extends Person{

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        //TODO Auto-generated constructor stub
    }
    public double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

class Employee{
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name of the empoyee is " + name);
        System.out.printf("Salary of %s is %d",name,salary);
        System.out.printf("\nId of %s is %d",name,id);
    }
}
public class EmployeeDetails{
    public static void main(String[] args) {
        String name = "Ishaan";
        int id = 1;
        int salary = 25000;
        
        Employee employee = new Employee(name,id,salary);
        employee.displayDetails();
    }
}


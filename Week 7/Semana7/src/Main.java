import Models.Customer;
import Models.Employee;
import ui.Form;

public class Main {
    public static void main(String[] args) {
        new Form();
        Employee newEmployee= new Employee("007","Rafa"
                ,"Odio", 500000);
        Customer newcustomer= new Customer("008","Jairo",
                "Gonzales", "1");
        System.out.println(newEmployee.getFirstname() + " " + newEmployee.getSalary());
        System.out.println(newcustomer.getFirstname()+ " "+ newcustomer.getAccountNumber());
    }
}
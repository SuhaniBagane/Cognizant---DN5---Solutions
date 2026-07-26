public class Main {

    public static void main(String[] args) {

        EmployeeManagement manager = new EmployeeManagement();

        manager.add(new Employee(1,"Rahul","Manager",60000));

        manager.add(new Employee(2,"Anjali","Developer",50000));

        manager.traverse();

    }

}
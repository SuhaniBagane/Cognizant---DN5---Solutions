public class EmployeeManagement {

    Employee[] employees = new Employee[10];

    int count = 0;

    public void add(Employee employee){

        employees[count++] = employee;

    }

    public Employee search(int id){

        for(int i=0;i<count;i++){

            if(employees[i].employeeId==id)

                return employees[i];

        }

        return null;

    }

    public void traverse(){

        for(int i=0;i<count;i++){

            System.out.println(employees[i].employeeId+" "+employees[i].name);

        }

    }

    public void delete(int id){

        for(int i=0;i<count;i++){

            if(employees[i].employeeId==id){

                for(int j=i;j<count-1;j++){

                    employees[j]=employees[j+1];

                }

                count--;

                break;

            }

        }

    }

}
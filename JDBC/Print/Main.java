package Print;

import com.dao.EmployeeDAOImp;
import com.dto.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
    EmployeeDAOImp e=new EmployeeDAOImp();



//        try {
//            Employee example=e.getEmployee(2);
//            System.out.println(example);
//        }
//        catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        try {
//            System.out.println(e.deleteEmployee(5));
//
//        }
//        catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

        List<Employee> em=e.getEmployee();
        for(Employee emp:em){
        System.out.println(emp);
    }
        try{
            System.out.println("Enter the id of employee to update the salary");
            int i=in.nextInt();
            boolean res=e.updateEmployee(i);
            System.out.println(res);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        List<Employee> emp=e.getEmployee();
        for(Employee empx:emp){
        System.out.println(empx);
    }

    }
}

package com.dao;

import java.sql.SQLException;
import java.util.List;
import com.dto.Employee;
public interface EmployeeDAO {
    List getEmployee();
    Employee getEmployee(int id) throws SQLException, ClassNotFoundException;

    boolean insertEmployee(int id,String name,String desig,int salary) throws SQLException, ClassNotFoundException;
    boolean updateEmployee(int id) throws SQLException, ClassNotFoundException;
    boolean deleteEmployee(int id) throws SQLException, ClassNotFoundException;


}

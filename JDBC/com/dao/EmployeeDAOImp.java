package com.dao;
import com.dto.Employee;
import com.connector.ConnectorClass;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeDAOImp implements EmployeeDAO {
    @Override
    public List getEmployee() {
        ArrayList<Employee> list=null;

        try{
            Connection con=ConnectorClass.requestConnection();
            String query="select * from emp";
            Statement stm=con.createStatement();
            ResultSet res=stm.executeQuery(query);
            list=new ArrayList<>();

            while(res.next()){
                int id=res.getInt(1);
                String name=res.getString(2);
                String desig=res.getString(3);
                int salary=res.getInt(4);
                Employee em=new Employee(id,name,desig,salary);
                list.add(em);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Employee getEmployee(int id1) throws SQLException, ClassNotFoundException {
        Connection con=ConnectorClass.requestConnection();
        String query="select * from emp where emp_id=?";
        PreparedStatement pstm=con.prepareStatement(query);
        pstm.setInt(1,id1);
        ResultSet res=pstm.executeQuery();
        res.next();
        int id=res.getInt(1);
        String name=res.getString(2);
        String desig=res.getString(3);
        int salary=res.getInt(4);
        Employee em=new Employee(id,name,desig,salary);

        return  em;
    }

    @Override
    public boolean insertEmployee(int id, String name, String desig, int salary) throws SQLException, ClassNotFoundException {
    Connection con=ConnectorClass.requestConnection();
    String query="insert into emp(id,name,desig,salary) values(?,?,?,?)";
    PreparedStatement pstm= con.prepareStatement(query);
    pstm.setInt(1,id);
    pstm.setString(2,name);
    pstm.setString(3,desig);
    pstm.setInt(4,salary);
    return pstm.execute();

    }

    @Override
    public boolean updateEmployee(int id) throws SQLException, ClassNotFoundException {
        Connection con=ConnectorClass.requestConnection();
        String query="update emp set salary=? where emp_id=?";
        PreparedStatement pstm=con.prepareStatement(query);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter new Salary");
        int salary=in.nextInt();

        pstm.setInt(1,salary);
        pstm.setInt(2,id);
        int i=pstm.executeUpdate();
        if(i==1)
            return true;
        return  false;


    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException, ClassNotFoundException {
        Connection con=ConnectorClass.requestConnection();
        String query="delete from emp where emp_id=?";
        PreparedStatement pstm=con.prepareStatement(query);
        pstm.setInt(1,id);
        return pstm.execute();



    }
}

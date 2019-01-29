/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(long id,String name,String password){
        Employee employee = new Employee();
        employee.setID(id);
        employee.setName(name);
        employee.setPassword(password);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee authenticate(long id, String password){
        for (Employee em : employeeList)
            if (id==em.getId() && em.getPassword().equals(password)){
                return em;
            }
        return null;
    }
}
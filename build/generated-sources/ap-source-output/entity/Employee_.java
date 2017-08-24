package entity;

import entity.Customer;
import entity.Employee;
import entity.Office;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T18:50:04")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> lastName;
    public static volatile SingularAttribute<Employee, String> firstName;
    public static volatile SingularAttribute<Employee, String> extension;
    public static volatile ListAttribute<Employee, Employee> employeeList;
    public static volatile SingularAttribute<Employee, String> jobTitle;
    public static volatile ListAttribute<Employee, Customer> customerList;
    public static volatile SingularAttribute<Employee, Office> office;
    public static volatile SingularAttribute<Employee, Employee> employee;
    public static volatile SingularAttribute<Employee, String> email;
    public static volatile SingularAttribute<Employee, Integer> employeeNumber;

}
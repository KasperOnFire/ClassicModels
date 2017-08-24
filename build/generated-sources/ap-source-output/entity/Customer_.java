package entity;

import entity.ClassicOrder;
import entity.Employee;
import entity.Payment;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T18:50:04")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> country;
    public static volatile SingularAttribute<Customer, String> city;
    public static volatile SingularAttribute<Customer, String> contactFirstName;
    public static volatile SingularAttribute<Customer, String> postalCode;
    public static volatile SingularAttribute<Customer, Integer> customerNumber;
    public static volatile SingularAttribute<Customer, Employee> employee;
    public static volatile ListAttribute<Customer, ClassicOrder> classicOrderList;
    public static volatile SingularAttribute<Customer, String> customerName;
    public static volatile ListAttribute<Customer, Payment> paymentList;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> addressLine1;
    public static volatile SingularAttribute<Customer, Double> creditLimit;
    public static volatile SingularAttribute<Customer, String> contactLastName;
    public static volatile SingularAttribute<Customer, String> addressLine2;
    public static volatile SingularAttribute<Customer, String> state;

}
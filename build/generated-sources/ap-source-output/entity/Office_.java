package entity;

import entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T18:50:04")
@StaticMetamodel(Office.class)
public class Office_ { 

    public static volatile SingularAttribute<Office, String> country;
    public static volatile ListAttribute<Office, Employee> employeeList;
    public static volatile SingularAttribute<Office, String> city;
    public static volatile SingularAttribute<Office, String> phone;
    public static volatile SingularAttribute<Office, String> postalCode;
    public static volatile SingularAttribute<Office, String> officeCode;
    public static volatile SingularAttribute<Office, String> addressLine1;
    public static volatile SingularAttribute<Office, String> addressLine2;
    public static volatile SingularAttribute<Office, String> state;
    public static volatile SingularAttribute<Office, String> territory;

}
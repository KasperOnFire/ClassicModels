package entity;

import entity.Customer;
import entity.Orderdetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T18:50:04")
@StaticMetamodel(ClassicOrder.class)
public class ClassicOrder_ { 

    public static volatile SingularAttribute<ClassicOrder, Integer> orderNumber;
    public static volatile SingularAttribute<ClassicOrder, String> comments;
    public static volatile ListAttribute<ClassicOrder, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<ClassicOrder, Date> requiredDate;
    public static volatile SingularAttribute<ClassicOrder, Date> orderDate;
    public static volatile SingularAttribute<ClassicOrder, Date> shippedDate;
    public static volatile SingularAttribute<ClassicOrder, String> status;
    public static volatile SingularAttribute<ClassicOrder, Customer> customer;

}
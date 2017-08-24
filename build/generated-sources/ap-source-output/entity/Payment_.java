package entity;

import entity.Customer;
import entity.PaymentPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T18:50:04")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Double> amount;
    public static volatile SingularAttribute<Payment, PaymentPK> paymentPK;
    public static volatile SingularAttribute<Payment, Date> paymentDate;
    public static volatile SingularAttribute<Payment, Customer> customer;

}
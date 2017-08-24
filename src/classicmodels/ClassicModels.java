package classicmodels;

import java.util.Random;

/**
 *
 * @author Kasper
 */
public class ClassicModels {

    public static void main(String[] args) {

        Random r = new Random();
        /*
        
        All classes corresponds with the tables in the database.
        The two classes OrderDetailPK and PaymentPK are generated because the tables have two primary keys,
        The reason that Netbeans/Eclipselink generates another class for this, is that an entity class can not have 2 primary keys.
        Another way to solve this problem would be to use an embeddable class in OrderDetail and Payment.
        
         */

        Facade face = new Facade();
        face.createEmployee();
        face.getEmployeeMaxCustomers();
        face.getAllOrdersOnHold();
        face.getOrdersOnHold(144); //try any number.
    }

}

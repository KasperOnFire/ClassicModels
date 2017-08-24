package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T18:50:04")
@StaticMetamodel(Productline.class)
public class Productline_ { 

    public static volatile SingularAttribute<Productline, String> productLine;
    public static volatile SingularAttribute<Productline, byte[]> image;
    public static volatile SingularAttribute<Productline, String> textDescription;
    public static volatile SingularAttribute<Productline, String> htmlDescription;
    public static volatile ListAttribute<Productline, Product> productList;

}
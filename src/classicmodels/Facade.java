package classicmodels;

import entity.ClassicOrder;
import entity.Customer;
import entity.Employee;
import entity.Office;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.Order;

public class Facade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClassicModelsPU");
    EntityManager em;
    Random r;

    public Facade() {
        r = new Random();

    }

    public Employee createEmployee() {
        em = emf.createEntityManager();
        Employee emp = new Employee();

        try {
            em.getTransaction().begin();
            emp.setFirstName("MEGATEST");
            emp.setLastName("MEDARBEJDERTEST");
            emp.setExtension("XXXXX");
            emp.setEmail("TEST@MAIL.com");
            emp.setOffice(em.find(Office.class, "1"));
            emp.setJobTitle("TEST MANAGER");
            emp.setEmployeeNumber(r.nextInt(Integer.MAX_VALUE));
            em.persist(emp);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return emp;
    }

    public Customer updateCustomer(Customer cust) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cust);
            em.getTransaction().commit();
            return cust;
        } finally {
            em.close();
        }

    }

    public int getEmployeeCount() {
        em = emf.createEntityManager();
        try {
            Query q = em.createNamedQuery("Employee.findAll");
            List<Customer> cm = q.getResultList();
            return cm.size();
        } finally {
            em.close();
        }
    }

    public List<Customer> getCustomerInCity(String city) {
        em = emf.createEntityManager();
        try {
            Query q = em.createNamedQuery("Customer.findByCity");
            List<Customer> cms = q.getResultList();
            return cms;
        } finally {
            em.close();
        }
    }

    public Employee getEmployeeMaxCustomers() {
        em = emf.createEntityManager();
        try {
            Query q = em.createQuery("SELECT c.employee, Count(c.employee) as ecount FROM Customer c GROUP BY c ORDER BY ecount desc");
            q.setMaxResults(1);
            List<Object[]> result = q.getResultList();
            for (Object[] c : result) {
                Employee e2 = (Employee) c[0];
                System.out.println(e2.getFirstName() + " IS THE WINNER! his ID is: " + e2.getEmployeeNumber());
                return e2;
            }
        } finally {
            em.close();
        }
        return null;
    }

    public List<ClassicOrder> getAllOrdersOnHold() {
        em = emf.createEntityManager();
        try {
            Query q = em.createNamedQuery("ClassicOrder.findByStatus");
            q.setParameter("status", "On Hold");
            List<ClassicOrder> od = q.getResultList();
            System.out.println("All ordernumbers currently on hold:");
            for (ClassicOrder order : od) {
                System.out.println(order.getOrderNumber());
            }
            return od;
        } finally {
            em.close();
        }
    }

    public List<ClassicOrder> getOrdersOnHold(int customerNumber) {
        em = emf.createEntityManager();
        List<ClassicOrder> sorted = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("ClassicOrder.findByStatus");
            q.setParameter("status", "On Hold");
            List<ClassicOrder> results = q.getResultList();
            for (ClassicOrder order : results) {
                if (order.getCustomer().getCustomerNumber() == customerNumber) {
                    sorted.add(order);
                    System.out.println("Order number: " + order.getOrderNumber()
                            + " is on hold for customernumber " + customerNumber);
                }
            }
        } finally {
            em.close();
        }
        if (sorted.size() < 1) {
            System.out.println("No orders on hold for customer number: " + customerNumber);
        }
        return sorted;
    }

}

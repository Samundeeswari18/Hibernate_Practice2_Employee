package com.Samundeeswari.Velusamy.Services;
import com.Samundeeswari.Velusamy.Model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDBServices {
        public static void addEmployee(SessionFactory factory,Session session) {

            Transaction transaction = session.beginTransaction();
            Employee employee = new Employee();
            employee.setEmp_age(43);
            employee.setEmp_name("MohanKumar");
            employee.setEmp_email("MohanKumar@gmail.com");
            employee.setEmp_phone("8965426589");
            employee.setEmp_surname("Rangasamy");

            Employee employee1 = new Employee();
            employee1.setEmp_age(40);
            employee1.setEmp_name("Samundeeswari");
            employee1.setEmp_email("samundeeswari@gmail.com");
            employee1.setEmp_phone("8965425899");
            employee1.setEmp_surname("Velusamy");


            Employee employee2 = new Employee();
            employee2.setEmp_age(14);
            employee2.setEmp_name("Deepesh");
            employee2.setEmp_email("Deepesh@gmail.com");
            employee2.setEmp_phone("9856234578");
            employee2.setEmp_surname("Maniyan");

            Employee employee3 = new Employee();
            employee3.setEmp_age(11);
            employee3.setEmp_name("Ritisha");
            employee3.setEmp_email("Ritisha@gmail.com");
            employee3.setEmp_phone("568954589");
            employee3.setEmp_surname("Maniyan");

            Employee employee4 = new Employee();
            employee4.setEmp_age(47);
            employee4.setEmp_name("Maniyan");
            employee4.setEmp_email("Maniyan@gmail.com");
            employee4.setEmp_phone("6146536864");
            employee4.setEmp_surname("Mariappan");

            session.persist(employee);
            session.persist(employee1);
            session.persist(employee2);
            session.persist(employee3);
            session.persist(employee4);

            transaction.commit();
            System.out.println("successfully Employee data's saved");
            factory.close();
            session.close();
        }

    public static void findUser(SessionFactory factory,Session session,int employee_id){
//       Todo comment out addUser method and uncomment findUser method

        Transaction tx = session.beginTransaction();

        Employee E = session.get(Employee.class, employee_id);
        System.out.println("FullName: " + E.getEmp_name());
        System.out.println("Email: " + E.getEmp_email());
        System.out.println("password: " + E.getEmp_phone());
        System.out.println("Surname: " + E.getEmp_surname());
        System.out.println("Age: " + E.getEmp_age());

        //Close resources
        tx.commit();
        factory.close();
        session.close();
    }

public void updateEmployee(SessionFactory factory,Session session,int employee_id){
            Transaction tx = session.beginTransaction();
            Employee E = session.get(Employee.class, employee_id);
            E.setEmp_age(44);
            E.setEmp_name("Moha");
            E.setEmp_email("Moha@gmail.com");
            E.setEmp_phone("12345678");
            E.setEmp_surname("R");
            session.merge(E);
            session.getTransaction().commit();
            factory.close();
            session.close();

}
public void deleteEmployee(Session session,int employee_id){
            Transaction tx = session.beginTransaction();
            Employee E = session.get(Employee.class, employee_id);
//            E.setEmp_id(employee_id);
            session.remove(E);
            tx.commit();

}
}

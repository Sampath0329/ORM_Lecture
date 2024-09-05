package org.example;


import org.example.config.FactoryConfiguration;
import org.example.entity.Address;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("S001","Sampath");
        Address address = new Address(1,"453/C1","Egodawela,Karandeniy",student);

        Session session = FactoryConfiguration.getInstance().getSession();

        // Open Transaction

        Transaction transaction = session.beginTransaction();

        session.save(address);
        session.save(student);

        transaction.commit();
        session.close();

    }
}
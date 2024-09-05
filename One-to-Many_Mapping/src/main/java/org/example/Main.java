package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Address;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Student student = new Student("S001","Nadish");
        List<Address> list =new ArrayList<>();
        list.add(new Address(1,"453/Ci","Egodawela, Karandeniya",student));
        list.add(new Address(2,"453/Ci","Egodawela, Karandeniya",student));


        Transaction transaction = session.beginTransaction();

        session.save(student);
        for (Address address : list){
            session.save(address);
        }

        transaction.commit();
        session.close();

    }
}
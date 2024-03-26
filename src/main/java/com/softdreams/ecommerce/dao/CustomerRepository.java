package com.softdreams.ecommerce.dao;

import com.softdreams.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //Select * from customer c where c.email = the email
    Customer findByEmail(String theEmail);
}

package com.b2mate.clientSide;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Will on 6/9/18.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByTelegram(String telegram);

}

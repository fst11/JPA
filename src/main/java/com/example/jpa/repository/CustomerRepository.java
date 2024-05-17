package com.example.jpa.repository;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
//    By extending this repository with crudrepository, the following methods are implemented
//    save()
//    find function(One, byId, All)()
//    count()
//    delete()
}
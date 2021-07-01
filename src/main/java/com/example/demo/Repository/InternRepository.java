package com.example.demo.Repository;

import com.example.demo.Intern.Intern;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InternRepository extends MongoRepository<Intern,Integer> {

}

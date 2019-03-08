package com.app.mongodbreactive.repository;

import com.app.mongodbreactive.model.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends ReactiveMongoRepository<Company,String> {





}

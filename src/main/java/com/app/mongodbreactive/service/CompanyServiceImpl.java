package com.app.mongodbreactive.service;

import com.app.mongodbreactive.model.Company;
import com.app.mongodbreactive.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class CompanyServiceImpl {


    private   final CompanyRepo repo;



    @Autowired(required = true)
    public CompanyServiceImpl(CompanyRepo repo) {
        this.repo = repo;
    }

    @Autowired
    private NextSequenceService seqService;

    public Mono<Company> insertCompany(Company company){
       company.idinitilizer();
       Mono<Company> resCompany = repo.save(company);
       return resCompany;
    }

    public Mono<Company> getById(String companyId){
        Mono<Company> resCompany=repo.findById(companyId);
        return resCompany;
    }

    public Flux<Company> getAllCompany(){
        Flux<Company> allCompanys=repo.findAll();
        return allCompanys;

    }


}

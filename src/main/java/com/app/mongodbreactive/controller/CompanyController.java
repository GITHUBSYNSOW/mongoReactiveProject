package com.app.mongodbreactive.controller;

import com.app.mongodbreactive.model.Company;
import com.app.mongodbreactive.service.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyServiceImpl service;

    @Autowired
    public CompanyController(CompanyServiceImpl service) {
        this.service = service;
    }


    @PostMapping
    public Mono<Company> register(@RequestBody Company company){
        Mono<Company> res=service.insertCompany(company);
        return res;

    }

    @GetMapping("/{companyId}")
    public Mono<Company>  searchCompany(@PathVariable String companyId){
        Mono<Company> res=service.getById(companyId);
        return res;
    }


    @GetMapping
    public Flux<Company> getAllCompanys(){
        Flux<Company> result=service.getAllCompany();
        return result;
    }



}

package com.app.mongodbreactive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Update;
import sun.management.counter.Counter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Document
public class Company{

    @Id
    private  String cid;


    private  String companyName;
    private  String companyOwner;
    private Date  date;
    private List<Employee> empList;

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }


    public Company(String cid, String companyName, String companyOwner,Date date,List<Employee> empList) {
        this.cid = UUID.randomUUID().toString();
        this.companyName = companyName;
        this.companyOwner = companyOwner;
        this.date=date;

        this.empList=empList;
    }

    public Company(){}

    public void idinitilizer(){
        this.empList.forEach(x->x.setEmpId( UUID.randomUUID().toString()));
        this.empList.forEach(Employee::empIdintilizer);

    }





}

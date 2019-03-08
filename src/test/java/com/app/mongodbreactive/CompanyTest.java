package com.app.mongodbreactive;


import com.app.mongodbreactive.model.Company;
import com.app.mongodbreactive.model.Employee;
import com.app.mongodbreactive.model.Project;
import com.app.mongodbreactive.service.CompanyServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongodbreactiveApplication.class)
public class CompanyTest {

    @Autowired
    private CompanyServiceImpl companyService;


    @Test
    public  void insertCompanyTest(){

        List<Employee> empList=new ArrayList<Employee>();
        Employee emp=new Employee();
        emp.setEmpName("sai");
        emp.setSalary("1200000");
        emp.setDesg("java developer");
        //emp.setEmpId();
        empList.add(emp);
        List<Project>  projList=new ArrayList<Project>();
        Project  proj=new Project();
        proj.setProjId("1");

        Company company=new Company();
        //company.setId("6");
        company.setCompanyName("synycs");
        company.setCompanyOwner("SynycsOwner");
        company.setDate(new Date());
        company.setEmpList(empList);
        Mono<Company> res= companyService.insertCompany(company);
        if(res!=null) {

            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println(res);
            Assert.assertTrue("Company  inserted sucessfully", true);
        }
        Assert.assertFalse("Company not  inserted ",false);


    }



}

package com.app.mongodbreactive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Document
public class Employee {
    @Id
     private  String empId;
     private  String empName;
     private  String salary;
     private  String desg;
     private  Date  dob;
     private List<Project> projectList;

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }




    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public Employee(){

    }
    public Employee(String empId, String empName, String salary, String desg, Date dob,List<Project> projectList) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.desg = desg;
        this.dob = dob;
        this.projectList=projectList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", desg='" + desg + '\'' +
                ", dob=" + dob +
                '}';
    }


    public void empIdintilizer(){
        this.projectList.forEach(x->x.setProjId(UUID.randomUUID().toString()));

    }
}

package com.app.mongodbreactive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document
public class Project {


    @Id
    private String projId;
    private String  projName;

    public Project(){

    }

    public Project(String projId, String projName) {
        this.projId = projId;
        this.projName = projName;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projId='" + projId + '\'' +
                ", projName='" + projName + '\'' +
                '}';
    }
}

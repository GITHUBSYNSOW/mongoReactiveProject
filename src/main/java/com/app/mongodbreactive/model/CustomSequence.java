package com.app.mongodbreactive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customSequence")
public class CustomSequence {

    @Id
    private String Id;
    private  int seq;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}

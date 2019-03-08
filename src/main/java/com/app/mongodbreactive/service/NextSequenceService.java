package com.app.mongodbreactive.service;

import com.app.mongodbreactive.model.CustomSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.*;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.*;



import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import sun.management.counter.Counter;

@Service
public class NextSequenceService {
    @Autowired
    private MongoOperations mongo;

    public int getNextSequence(String seqName)
    {
        CustomSequence counter = mongo.findAndModify(
            query(where("_id").is(seqName)),
            new Update().inc("seq",1),
            options().returnNew(true).upsert(true),
            CustomSequence.class);
        return counter.getSeq();
    }
}


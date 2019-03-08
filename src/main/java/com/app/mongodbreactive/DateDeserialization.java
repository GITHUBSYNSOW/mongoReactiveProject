package com.app.mongodbreactive;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.val;
import org.springframework.data.mongodb.core.aggregation.DateOperators;

import java.io.IOException;
import java.time.LocalDate;

public class DateDeserialization extends JsonDeserializer<LocalDate>{

   @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
      //  val localDate = DateTimeZoneConverters.dateFromString(jsonParser.getText());
        return  null;
    }


}


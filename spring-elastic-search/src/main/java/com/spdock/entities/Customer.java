package com.spdock.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString()

public class Customer {
    @Id
    private String id;

    @Field(name= "customerName", type = FieldType.Text)
    private String customerName;

    @Field(name= "customerSurname", type = FieldType.Text)
    private String customerSurname;

    @Field(name= "customerAddress", type = FieldType.Text)
    private String customerAddress;

    //Check This FiledType For DB Errors
    @Field(name= "customerBirthdate", type = FieldType.Date)
    private Date customerBirthdate;

}

package com.example.StaccChallange.Stacc;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Person {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "schema")
    private String schema;
    @Column(name = "name")
    private String name;
    @Column(name = "aliases")
    private String aliases;
    @Column(name = "birth_date")
    private String birth_date;
    @Column(name = "countries")
    private String countries;
    @Column(name = "addresses")
    private String addresses;
    @Column(name = "identifiers")
    private String identifiers;
    @Column(name = "sanctions")
    private String sanctions;
    @Column(name = "phones")
    private String phones;
    @Column(name = "emails")
    private String emails;
    @Column(name = "dataset")
    private String dataset;
    @Column(name = "last_seen")
    private LocalDateTime last_seen;
    @Column(name = "first_seen")
    private LocalDateTime first_seen;
}

package com.example.theofficemanager.models;

import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 225)
    private String person;

    @Column(nullable = false, length = 1000)
    private String quote;


    public Post(){}

//    public Post(Long id, String person, String quote){
//        this.id = id;
//        this.person = person;
//        this.quote = quote;
//
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }


}

package com.visal.learning.BookStore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Integer author_id;

    @Column (name = "author_name")
    private String name;

    @Column(name = "author_nationality")
    private String nationality;

    @Column (name = "author_bio")
    private String bio;


}
//@Data
//@Entity
//@Table(name = "models")
//public class Model {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "model_id")
//    private Integer id;
//
//    @Column(name = "model_name")
//    private String name;
//
//    @ManyToOne
//    @JoinColumn(name = "brandId")
//    private Brand brand;
//
//}
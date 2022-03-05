package com.javaCrud.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qty;
    private double price;

}

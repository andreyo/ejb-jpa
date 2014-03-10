package com.ao.jpa.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by elena on 3/9/14.
 */
@Entity
public class Employee {

    @Id
    Long id;
    private String name;
}

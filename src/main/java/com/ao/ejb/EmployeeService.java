package com.ao.ejb;

import com.ao.jpa.bean.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by elena on 3/9/14.
 */
@Stateless
public class EmployeeService {

    @PersistenceContext
    EntityManager em;

    public void createEmployee() {
        Employee employee = new Employee();
        em.persist(employee);
    }
}

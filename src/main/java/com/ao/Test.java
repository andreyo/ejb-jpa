package com.ao;

import com.ao.ejb.EmployeeService;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by elena on 3/9/14.
 */
@Path("/test")
public class Test {

    @EJB
    EmployeeService employeeService;

    @GET
    public String get() {
        employeeService.createEmployee();
        return "HelloWorld";
    }
}

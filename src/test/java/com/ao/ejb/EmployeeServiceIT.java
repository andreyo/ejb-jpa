package com.ao.ejb;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

/**
 * Created by elena on 3/11/14.
 */
public class EmployeeServiceIT {

    private static final Logger log = Logger.getLogger(EmployeeServiceIT.class);

    @Test
    public void testCreateEmployee() throws Exception {
        log.info("before test");
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");

        // glassfish default port value will be 3700,
        props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

        InitialContext ctx = new InitialContext(props);
//        InitialContext ctx = new InitialContext();
        log.info("before lookup");
        Object object = ctx.lookup("java:global/classes/EmployeeService");
        log.info("got object : " + object);
        EmployeeService employeeService = (EmployeeService) object;
        log.info("after lookup");
        employeeService.createEmployee();
        log.info("after method invocation");
        ctx.close();
        log.info("context closed");
    }


    @Test
    public void testName() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        log.info("tear dowm test");
    }
}

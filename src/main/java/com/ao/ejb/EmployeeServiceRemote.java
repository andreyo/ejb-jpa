package com.ao.ejb;

import javax.ejb.Remote;

/**
 * Created by elena on 3/11/14.
 */
@Remote
public interface EmployeeServiceRemote {
    void createEmployee();
}

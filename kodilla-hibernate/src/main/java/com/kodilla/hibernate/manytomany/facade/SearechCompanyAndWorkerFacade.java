package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearechCompanyAndWorkerFacade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchForCompany(String name) {
        return companyDao.retrieveCompanyName(name + "%");
    }

    public List<Employee> searchForEmployee(String name) {
        return employeeDao.retrieveEmployeeByName(name + "%");
    }
}

package com.jobapplication.firstjobapp.company;

import com.jobapplication.firstjobapp.job.Job;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    boolean deleteCompanyById(Long id);


}

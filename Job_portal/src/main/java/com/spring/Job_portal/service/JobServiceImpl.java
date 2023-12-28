package com.spring.Job_portal.service;

import com.spring.Job_portal.dto.JobDto;
import com.spring.Job_portal.model.JobModel;
import com.spring.Job_portal.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{
    @Autowired
    private Repo repo;

    @Override
    public JobModel save(JobDto jobDto) {
        JobModel jobModel = new JobModel(jobDto.getFullName(), jobDto.getEmail(), jobDto.getPhno(), jobDto.getQualification(), jobDto.getBranch(), jobDto.getPassed_out(),
                jobDto.getSkills(), jobDto.getLocation(), jobDto.getJobDesc(), jobDto.getPreffered_role(), jobDto.getJob_type(), jobDto.getSalary());
        return repo.save(jobModel);
    }
}

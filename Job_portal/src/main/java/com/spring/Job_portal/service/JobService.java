package com.spring.Job_portal.service;

import com.spring.Job_portal.dto.JobDto;
import com.spring.Job_portal.model.JobModel;
import org.springframework.stereotype.Service;


public interface JobService {

    JobModel save(JobDto jobDto);
}

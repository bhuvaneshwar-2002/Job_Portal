package com.spring.Job_portal.repository;

import com.spring.Job_portal.model.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<JobModel, Long> {



}

package com.spring.Job_portal.controller;

import com.spring.Job_portal.dto.JobDto;
import com.spring.Job_portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller

public class JobController {
//    @Autowired
//    private JobService jobService;

    @GetMapping("/form")
    public String showform(){
        return "form";
    }
}

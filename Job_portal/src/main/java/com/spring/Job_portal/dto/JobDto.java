package com.spring.Job_portal.dto;

public class JobDto {
    private String fullName;
    private String email;
    private Long phno;
    private String Qualification;
    private String Branch;
    private Long passed_out;
    private String skills;
    private String location;
    private String jobDesc;
    private String preffered_role;
    private String job_type;
    private Long salary;

    public JobDto(String fullName, String email, Long phno, String qualification, String branch, Long passed_out,
                  String skills, String location, String jobDesc, String preffered_role, String job_type, Long salary) {
        this.fullName = fullName;
        this.email = email;
        this.phno = phno;
        Qualification = qualification;
        Branch = branch;
        this.passed_out = passed_out;
        this.skills = skills;
        this.location = location;
        this.jobDesc = jobDesc;
        this.preffered_role = preffered_role;
        this.job_type = job_type;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public Long getPassed_out() {
        return passed_out;
    }

    public void setPassed_out(Long passed_out) {
        this.passed_out = passed_out;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getPreffered_role() {
        return preffered_role;
    }

    public void setPreffered_role(String preffered_role) {
        this.preffered_role = preffered_role;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}

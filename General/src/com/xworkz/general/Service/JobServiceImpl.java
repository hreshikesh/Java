package com.xworkz.general.Service;

import com.xworkz.general.Dto.JobDTO;

public class JobServiceImpl implements JobService{

    @Override
    public String validateandsave(JobDTO jobDTO) {
        System.out.println("validate and save in job service");
        return "Failure";
    }
}

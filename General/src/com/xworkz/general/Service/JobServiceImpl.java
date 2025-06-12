package com.xworkz.general.Service;

import com.xworkz.general.Dto.JobDTO;
import com.xworkz.general.Repository.JobRepository;
import com.xworkz.general.Repository.JobRepositoryImpl;

public class JobServiceImpl implements JobService{

    @Override
    public String validateAndSave(JobDTO jobDTO) {
        System.out.println("validate and save in job service");
        if(jobDTO!=null){
            System.out.println("Job Dot is not null");
            JobRepository jobRepository=new JobRepositoryImpl();
            jobRepository.save(jobDTO);
        }
        return "Failure";
    }
}

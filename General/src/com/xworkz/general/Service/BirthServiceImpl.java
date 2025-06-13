package com.xworkz.general.Service;

import com.xworkz.general.Dto.BirthDto;
import com.xworkz.general.Repository.BirthRepository;
import com.xworkz.general.Repository.BirthRepositoryImpl;

public class BirthServiceImpl implements BirthService {
    @Override
    public String validateAndSave(BirthDto dto) {
        System.out.println("Validate and save");
        BirthRepository birthReference=new BirthRepositoryImpl();
        if (dto != null) {
            System.out.println("BirthDto is not null, proceeding to save");
            birthReference.save(dto);
            
        }
        return "Failure";
    }

}

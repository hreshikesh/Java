package com.xworkz.general.Service;

import com.xworkz.general.Dto.MarriageDto;
import com.xworkz.general.Repository.MarriageRepository;
import com.xworkz.general.Repository.MarriageRepositoryImpl;

public class MarriageServiceImpl implements MarriageService {

    @Override
    public String validateAndSave(MarriageDto marriageDto) {
        System.out.println("Validate and save in MarriageService");

        if(marriageDto!=null){
            System.out.println("MarriageDto is not null, proceeding to save");
            MarriageRepository repository=new MarriageRepositoryImpl();
            repository.save(marriageDto);

        }
        return "Failure";
    }
}

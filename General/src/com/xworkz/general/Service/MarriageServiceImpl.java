package com.xworkz.general.Service;

import com.xworkz.general.Dto.MarriageDto;

public class MarriageServiceImpl implements MarriageService {

    @Override
    public String validateAndSave(MarriageDto marriageDto) {
        System.out.println("Validate and save in MarriageService");
        return "Failure";
    }
}

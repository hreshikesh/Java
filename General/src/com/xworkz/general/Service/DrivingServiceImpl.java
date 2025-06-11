package com.xworkz.general.Service;

import com.xworkz.general.Dto.DrivingDto;

public class DrivingServiceImpl implements DrivingService {

    @Override
    public String validateAndSave(DrivingDto drivingDto) {
        System.out.println("Validate and save in DrivingService");
        return "Failure";
    }
}

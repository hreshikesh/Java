package com.xworkz.general.Service;

import com.xworkz.general.Dto.DrivingDto;
import com.xworkz.general.Repository.DrivingRepository;
import com.xworkz.general.Repository.DrivingRepositoryImpl;

public class DrivingServiceImpl implements DrivingService {

    @Override
    public String validateAndSave(DrivingDto drivingDto) {
        System.out.println("Validate and save in DrivingService");
        if (drivingDto != null) {
            System.out.println("DrivingDto is not null, proceeding to save");
            DrivingRepository drivingRepository = new DrivingRepositoryImpl();
            return "Success";
        }
        return "Failure";
    }
}

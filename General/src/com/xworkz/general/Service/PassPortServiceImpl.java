package com.xworkz.general.Service;

import com.xworkz.general.Dto.PassPortDto;
import com.xworkz.general.Repository.PassportRepository;
import com.xworkz.general.Repository.PassportRepositoryImpl;

public class PassPortServiceImpl implements PassPortService{
    @Override
    public String validateAndSave(PassPortDto passPortDto) {
        System.out.println("Validate and save in PassPortService");
        if(passPortDto!=null){
            System.out.println("Passport dto is not null - proceeding to save");
            PassportRepository passportRepository = new PassportRepositoryImpl();
            passportRepository.save(passPortDto);

        }
        return "Failure";
    }
}

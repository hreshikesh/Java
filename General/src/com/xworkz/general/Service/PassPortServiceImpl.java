package com.xworkz.general.Service;

import com.xworkz.general.Dto.PassPortDto;

public class PassPortServiceImpl implements PassPortService{
    @Override
    public String validateAndSave(PassPortDto passPortDto) {
        System.out.println("Validate and save in PassPortService");
        return "Failure";
    }
}

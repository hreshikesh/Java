package com.xworkz.general.Service;

import com.xworkz.general.Dto.BirthDto;

public class BirthServiceImpl implements BirthService {
    @Override
    public String validateandsave(BirthDto dto) {
        System.out.println("Validate and save");
        return "Failure";
    }

}

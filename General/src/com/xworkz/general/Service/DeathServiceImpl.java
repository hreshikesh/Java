package com.xworkz.general.Service;

import com.xworkz.general.Dto.DeathDto;

public class DeathServiceImpl implements DeathService {


    @Override
    public String validateandsave(DeathDto dto) {
        System.out.println("Validate and save in DeathService");
        return "Failure";
    }
}

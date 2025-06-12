package com.xworkz.general.Service;

import com.xworkz.general.Dto.DeathDto;
import com.xworkz.general.Repository.DeathRepository;
import com.xworkz.general.Repository.DeathRepositoryImpl;

public class DeathServiceImpl implements DeathService {


    @Override
    public String validateAndSave(DeathDto dto) {
        System.out.println("Validate and save in DeathService");
        DeathRepository deathReference = new DeathRepositoryImpl();
        if (dto != null) {
            System.out.println("DeathDto is not null, proceeding to save");
            deathReference.save(dto);
        }
        return "Failure";
    }
}

package com.xworkz.carregister.service;

import com.xworkz.carregister.dto.RegisterDto;
import com.xworkz.carregister.repository.RegisterRepositary;
import com.xworkz.carregister.repository.RegisterRepositoryImpl;

public class RegisterServiceImpl implements RegisterService{
    @Override
    public String validateAndSave(RegisterDto registerDto) {

        if(registerDto!=null){

            RegisterRepositary registerRepositary=new RegisterRepositoryImpl();
            registerRepositary.save(registerDto);

            return "true";
        }
        return "false";
    }
}

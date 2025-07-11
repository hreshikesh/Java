package com.xworkz.login.service;

import com.xworkz.login.dto.LoginDto;
import com.xworkz.login.repository.LoginRepository;
import com.xworkz.login.repository.LoginRepositoryImpl;

import java.util.ArrayList;

public class LoginServiceImpl implements LoginService{
    //for saving
    @Override
    public String validate(LoginDto loginDto) {
        if(loginDto!=null){
            LoginRepository loginRepository=new LoginRepositoryImpl();
            loginRepository.save(loginDto);
            return "save";


        }

        return "fail";
    }


//for retreiving
   @Override
    public ArrayList<LoginDto> findAll() {
        LoginRepository repository = new LoginRepositoryImpl();
        return repository.retrive();
    }
}

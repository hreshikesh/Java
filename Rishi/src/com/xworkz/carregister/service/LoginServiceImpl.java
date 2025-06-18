package com.xworkz.carregister.service;

import com.xworkz.carregister.dto.LoginDto;
import com.xworkz.carregister.repository.LoginRepository;
import com.xworkz.carregister.repository.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService{
    @Override
    public String validateAndSave(LoginDto loginDto) {
            if(loginDto!=null){
                LoginRepository loginRepository=new LoginRepositoryImpl();
                loginRepository.save(loginDto);
                return "true";
            }
            return "false";





        }


}

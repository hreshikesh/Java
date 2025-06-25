package com.xworkz.bmtc.Service;

import com.xworkz.bmtc.Dto.SignUpDto;
import com.xworkz.bmtc.Repository.SigninRepository;
import com.xworkz.bmtc.Repository.SigninRepositoryImpl;

public class SiginServiceImpl implements SigninService {
    @Override
    public String findCredentials(String userID, String password) {
        if(!userID.equals("null") && !password.equals("null")){
            SigninRepository signinRepository=new SigninRepositoryImpl();
            SignUpDto signUpDto=signinRepository.findCredentials(userID,password);
            if(signUpDto!=null){
                if(userID.equals(signUpDto.getUserId()) && password.equals(signUpDto.getPassword())){
                    return "valid credentials";
                }
            }
            else return "Credentials not found";
        }
        return "Credentials are Empty";
    }
}

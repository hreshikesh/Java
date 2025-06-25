package com.xworkz.bmtc.Service;

import com.xworkz.bmtc.Dto.SignUpDto;
import com.xworkz.bmtc.Repository.SignupRepository;
import com.xworkz.bmtc.Repository.SignupRepositoryImpl;

public class SignupServiceImpl implements SignUpService {

    @Override
    public String validate(SignUpDto signUpDto) {
        if (signUpDto != null) {
            if (signUpDto.getUserId().length() <5 || signUpDto.getUserId().length()>15){
                return "userId invalid";
            } else if (signUpDto.getEmail().equals("null")) {

                return "email is empty";
            } else if (!signUpDto.getPassword().equals(signUpDto.getConfirmPassword())) {
                return "password not matching";
            } else {
                SignupRepository bmtcRepository = new SignupRepositoryImpl();
                bmtcRepository.save(signUpDto);
                return "saved";
            }


        }
         return "not saved";

    }

}


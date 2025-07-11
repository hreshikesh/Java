package com.xworkz.login.service;

import com.xworkz.login.dto.LoginDto;

import java.util.ArrayList;

public interface LoginService {

    String validate(LoginDto loginDto);

    ArrayList<LoginDto> findAll();
}

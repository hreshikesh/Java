package com.xworkz.login.repository;

import com.xworkz.login.dto.LoginDto;

import java.util.ArrayList;

public interface LoginRepository {
    void save(LoginDto loginDto);

    ArrayList<LoginDto> retrive();
}

package com.xworkz.carregister.service;

import com.xworkz.carregister.dto.LoginDto;

public interface LoginService {
    public String validateAndSave(LoginDto loginDto);
}

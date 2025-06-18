package com.xworkz.carregister.repository;

import com.xworkz.carregister.dto.LoginDto;


public interface LoginRepository {
    public void save(LoginDto loginDto);
}

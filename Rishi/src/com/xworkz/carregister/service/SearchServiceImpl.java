package com.xworkz.carregister.service;

import com.xworkz.carregister.dto.RegisterDto;
import com.xworkz.carregister.repository.RegisterRepositary;
import com.xworkz.carregister.repository.RegisterRepositoryImpl;
import com.xworkz.carregister.repository.SearchRepositoey;
import com.xworkz.carregister.repository.SearchRepositoryImpl;

public class SearchServiceImpl implements SearchService{


    @Override
    public RegisterDto validate(String name) {
        if(name.length()<20){
            System.out.println("Name is Valid");

            SearchRepositoey searchRepositoey=new SearchRepositoryImpl();
            RegisterDto registerDto=searchRepositoey.find(name);

            return registerDto;
        }else return null;
    }
}

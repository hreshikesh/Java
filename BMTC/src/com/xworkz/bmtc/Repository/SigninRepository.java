package com.xworkz.bmtc.Repository;

import com.xworkz.bmtc.Dto.SignUpDto;

public interface SigninRepository {

    SignUpDto findCredentials(String userID, String password);
}

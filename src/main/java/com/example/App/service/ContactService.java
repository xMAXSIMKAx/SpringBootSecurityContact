package com.example.App.service;

import com.example.App.dto.ContactDto;
import com.example.App.entity.Contact;

import java.util.List;

public interface ContactService {
    void saveUser(ContactDto contactDto);
    Contact findByEmail(String email);
    List<ContactDto> findAllUsers();
}

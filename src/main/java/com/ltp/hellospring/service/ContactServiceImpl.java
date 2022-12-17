package com.ltp.hellospring.service;

import org.springframework.stereotype.Service;

import com.ltp.hellospring.pojo.Contact;

@Service
public class ContactServiceImpl implements ContactService {

    @Override
    public Contact getContactById(String id) {
        return new Contact("vivek", Integer.parseInt(id));
    }

    @Override
    public Contact saveContact(Contact contact) {
        return contact;
    }
}

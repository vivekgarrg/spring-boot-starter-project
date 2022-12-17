package com.ltp.hellospring.service;

import com.ltp.hellospring.pojo.Contact;

public interface ContactService {
    public Contact getContactById(String id);

    public Contact saveContact(Contact contact);
}

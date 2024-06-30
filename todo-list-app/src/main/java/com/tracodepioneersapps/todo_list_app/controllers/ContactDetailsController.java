package com.tracodepioneersapps.todo_list_app.controllers;

import com.tracodepioneersapps.todo_list_app.models.ContactDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(path = "/api/v1/contactDetails")
public class ContactDetailsController {
    public CopyOnWriteArrayList<ContactDetails> contacts = new CopyOnWriteArrayList<>();

    @PostMapping
    public ContactDetails addContact(@RequestBody ContactDetails contact) {
        contacts.add(contact);
        return contact;
    }

    @GetMapping
    public List<ContactDetails> getContacts() {
        return contacts;
    }
}

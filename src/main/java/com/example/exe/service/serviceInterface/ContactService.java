package com.example.exe.service.serviceInterface;

import com.example.exe.models.Company;
import com.example.exe.models.Contact;
import com.example.exe.payload.request.ContactRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContactService  {
    List<Contact> getAll();
    Optional<Contact> getById(String id);
    void create(Contact newEntity);
    void update(String id, Contact newEntity);
    void delete(String id);
}

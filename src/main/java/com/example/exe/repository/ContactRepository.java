package com.example.exe.repository;

import com.example.exe.models.Contact;
import com.example.exe.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, String> {
}

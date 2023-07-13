package com.example.exe.service.serviceImplement;

import com.example.exe.exception.NullException;
import com.example.exe.mappers.IMapper;
import com.example.exe.models.Company;
import com.example.exe.models.Contact;
import com.example.exe.payload.request.ContactRequest;
import com.example.exe.repository.ContactRepository;
import com.example.exe.service.serviceInterface.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImplement implements ContactService {
    @Autowired
    ContactRepository contactRepository;
    @Autowired
    private IMapper mapper;

    @Override
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @Override
    public Optional<Contact> getById(String id) {
        return contactRepository.findById(id);
    }

    @Override
    public void create(Contact newEntity) {
        contactRepository.save(newEntity);
    }

    @Override
    public void update(String id, Contact newEntity) {
        contactRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {
//        Optional<Contact> foundE = contactRepository.findById(id);
//        if (foundE.isEmpty()) throw new NullException("Not found");
//        Contact entityPresent = foundE.get();
//        entityPresent.setDelete(true);
//        contactRepository.save(entityPresent);
        contactRepository.deleteById(id);
    }
}

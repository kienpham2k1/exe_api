package com.example.exe.mappers;

import com.example.exe.models.Company;
import com.example.exe.models.Contact;
import com.example.exe.payload.request.CompanyRequest;
import com.example.exe.payload.request.ContactRequest;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Builder
public class ContactContactRequestMapperImplr implements IMapper<Contact, ContactRequest> {
    @Override
    public ContactRequest sourceToDestination(Contact source) {
        if (source == null) {
            return null;
        }
        ContactRequest destination = new ContactRequest();
        destination.setBaseSalary(source.getBaseSalary());
        destination.setDescription(source.getDescription());
        destination.setIdCompany(source.getIdCompany());
        destination.setIdEmployee(source.getIdEmployee());
        destination.setIdLevel(source.getIdLevel());
        destination.setIdPosition(source.getIdPosition());
        destination.setIdSkill(source.getIdSkill());
        destination.setName(source.getName());
        destination.setStatus(source.getStatus());
        return destination;
    }

    @Override
    public Contact destinationToSource(ContactRequest destination) {
        if (destination == null) {
            return null;
        }
        Contact source = new Contact();
        source.setBaseSalary(destination.getBaseSalary());
        source.setDescription(destination.getDescription());
        source.setIdCompany(destination.getIdCompany());
        source.setIdEmployee(destination.getIdEmployee());
        source.setIdLevel(destination.getIdLevel());
        source.setIdPosition(destination.getIdPosition());
        source.setIdSkill(destination.getIdSkill());
        source.setName(destination.getName());
        source.setStatus(destination.getStatus());
        return source;
    }

    @Override
    public List<ContactRequest> mapList(List<Contact> sourceList) {
        if (sourceList.isEmpty() || sourceList.size() == 0) {
            return null;
        }
        List<ContactRequest> list = new ArrayList<>();
        for (Contact company : sourceList) {
            list.add(sourceToDestination(company));
        }
        return list;
    }
}
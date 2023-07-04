package com.example.exe.mappers;

import com.example.exe.models.Company;
import com.example.exe.payload.request.CompanyRequest;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CompanyCompanyRequestMapperImplr implements IMapper<Company, CompanyRequest> {
    @Override
    public CompanyRequest sourceToDestination(Company source) {
        if (source == null) {
            return null;
        }
        CompanyRequest destination = new CompanyRequest();
        destination.setDescription(source.getDescription());
        destination.setEmail(source.getEmail());
        destination.setName(source.getName());
        destination.setPhoneNumber(source.getPhoneNumber());
        destination.setTaxCode(source.getTaxCode());
        destination.setStatus(source.getStatus());
        return destination;
    }

    @Override
    public Company destinationToSource(CompanyRequest destination) {
        if (destination == null) {
            return null;
        }
        Company source = new Company();
        source.setDescription(destination.getDescription());
        source.setEmail(destination.getEmail());
        source.setName(destination.getName());
        source.setPhoneNumber(destination.getPhoneNumber());
        source.setTaxCode(destination.getTaxCode());
        source.setStatus(destination.getStatus());
        return source;
    }

    @Override
    public List<CompanyRequest> mapList(List<Company> sourceList) {
        if (sourceList.isEmpty() || sourceList.size() == 0) {
            return null;
        }
        List<CompanyRequest> list = new ArrayList<>();
        for (Company company : sourceList) {
            list.add(sourceToDestination(company));
        }
        return  list;
    }
}
package com.example.exe.mappers;

import com.example.exe.models.Company;
import com.example.exe.payload.request.CompanyRequest;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Builder
public class CompanyCompanyRequestMapperImplr implements IMapper<Company, CompanyRequest> {
    @Override
    public CompanyRequest sourceToDestination(Company source) {
        if (source == null) {
            return null;
        }
        CompanyRequest simpleDestination = new CompanyRequest();
        simpleDestination.setDescription(source.getDescription());
        simpleDestination.setEmail(source.getEmail());
        simpleDestination.setName(source.getName());
        simpleDestination.setPhoneNumber(source.getPhoneNumber());
        simpleDestination.setTaxCode(source.getTaxCode());
        simpleDestination.setStatus(source.getStatus());
        return simpleDestination;
    }

    @Override
    public Company destinationToSource(CompanyRequest destination) {
        if (destination == null) {
            return null;
        }
        Company simpleSource = new Company();
        simpleSource.setDescription(destination.getDescription());
        simpleSource.setEmail(destination.getEmail());
        simpleSource.setName(destination.getName());
        simpleSource.setPhoneNumber(destination.getPhoneNumber());
        simpleSource.setTaxCode(destination.getTaxCode());
        simpleSource.setStatus(destination.getStatus());
        return simpleSource;
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
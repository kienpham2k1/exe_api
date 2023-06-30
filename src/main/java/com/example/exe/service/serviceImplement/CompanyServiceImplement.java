package com.example.exe.service.serviceImplement;

import com.example.exe.exception.NullException;
import com.example.exe.mappers.IMapper;
import com.example.exe.models.Company;
import com.example.exe.payload.request.CompanyRequest;
import com.example.exe.repository.CompanyRepository;
import com.example.exe.service.serviceInterface.CompanyService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Builder
public class CompanyServiceImplement implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    private IMapper mapper;

    @Override
    public List<Company> getAll() {
        //return mapper.mapList(companyRepository.findAll());
        return companyRepository.findAll();
    }

    @Override
    public Optional<Company> getById(String id) {
        return companyRepository.findById(id);
    }

    @Override
    public void create(CompanyRequest newEntity) {
        Company source = (Company) mapper.destinationToSource(newEntity);
        companyRepository.save(source);
    }

    @Override
    public void update(String id, CompanyRequest newEntity) {
        Company source = (Company) mapper.destinationToSource(newEntity);
        companyRepository.save(source);
    }

    @Override
    public void delete(String id) {
        Optional<Company> foundE = companyRepository.findById(id);
        if (foundE.isEmpty()) throw new NullException("Not found");
        Company entityPresent = foundE.get();
        entityPresent.setDelete(true);
        companyRepository.save(entityPresent);
    }
}

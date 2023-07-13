package com.example.exe.service.serviceImplement;

import com.example.exe.models.SubscriptionPackage;
import com.example.exe.repository.SubscriptionPackageRepository;
import com.example.exe.service.serviceInterface.SubscriptionPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionPackageServiceImplement implements SubscriptionPackageService {
    @Autowired
    SubscriptionPackageRepository subscriptionPackageRepository;

    @Override
    public List<SubscriptionPackage> getAll() {
        return subscriptionPackageRepository.findAll();
    }

    @Override
    public Optional<SubscriptionPackage> getById(String id) {
        return subscriptionPackageRepository.findById(id);
    }

    @Override
    public void create(SubscriptionPackage newEntity) {
        subscriptionPackageRepository.save(newEntity);
    }

    @Override
    public void update(String id, SubscriptionPackage newEntity) {
        subscriptionPackageRepository.save(newEntity);
    }

    @Override
    public void delete(String id) {
        Optional<SubscriptionPackage> entity = subscriptionPackageRepository.findById(id);
        if (entity.isPresent())
            subscriptionPackageRepository.deleteById(id);
    }
}

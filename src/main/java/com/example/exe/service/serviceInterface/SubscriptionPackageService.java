package com.example.exe.service.serviceInterface;

import com.example.exe.models.SubscriptionPackage;
import com.example.exe.models.Timekeeping;

import java.util.List;
import java.util.Optional;

public interface SubscriptionPackageService {
    List<SubscriptionPackage> getAll();
    Optional<SubscriptionPackage> getById(String id);
    void create(SubscriptionPackage newEntity);
    void update(String id, SubscriptionPackage newEntity);
    void delete(String id);
}

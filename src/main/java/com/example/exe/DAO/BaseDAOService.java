package com.example.exe.DAO;

import java.util.List;

public abstract class BaseDAOService<T>  {
    public abstract List<T> GetAll();
    public abstract T GetByID(String id);
    public abstract void Create(T newEntity);
    public abstract void Update(String id, T updateEntity);
    public abstract void Delete(String id);
}

package com.example.exe.mappers;

import org.mapstruct.Mapper;

import java.util.List;
import java.util.Scanner;

@Mapper
public interface IMapper<Source, Destination> {
    Destination sourceToDestination(Source source);
    Source destinationToSource(Destination destination);
    List<Destination> mapList(List<Source> sourceList);
}

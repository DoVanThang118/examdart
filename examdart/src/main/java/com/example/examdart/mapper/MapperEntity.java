package com.example.examdart.mapper;

public interface MapperEntity<D,E> {
    D mapEntityToDTO(E entity);
    E mapDTOToEntity(D dto);
}

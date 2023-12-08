package com.example.storage.domain.type;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class TypeService {
    @Resource
    private TypeRepository typeRepository;

    public Type getTypeBy(Integer typeId) {
        return typeRepository.getReferenceById(typeId);
    }
}

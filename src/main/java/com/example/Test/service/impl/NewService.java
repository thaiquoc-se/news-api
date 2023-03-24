package com.example.Test.service.impl;

import com.example.Test.converter.NewConverter;
import com.example.Test.dto.NewDTO;
import com.example.Test.entity.CategoryEntity;
import com.example.Test.entity.NewEntity;
import com.example.Test.repository.CategoryRepository;
import com.example.Test.repository.NewRepository;
import com.example.Test.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewService implements INewService {
    @Autowired
    private NewRepository newRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private NewConverter newConverter;
    public NewDTO save(NewDTO newDTO){
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
        NewEntity newEntity = newConverter.toEntity(newDTO);
        newEntity.setCategory(categoryEntity);
        newEntity = newRepository.save(newEntity);
        return newConverter.toDTO(newEntity);
    }

    public  NewDTO update(NewDTO newDTO){
        return null;
    }
}

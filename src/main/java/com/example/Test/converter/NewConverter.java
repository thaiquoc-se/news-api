package com.example.Test.converter;

import com.example.Test.dto.NewDTO;
import com.example.Test.entity.NewEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {
 public NewEntity toEntity(NewDTO dto){
     NewEntity entity = new NewEntity();
     entity.setTitle(dto.getTitle());
     entity.setContent(dto.getContent());
     entity.setShortDescription(dto.getShortDescription());
     entity.setThumbnail(dto.getThumbnail());
     return entity;
 }

    public NewDTO toDTO (NewEntity entity){
        NewDTO dto = new NewDTO();
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        dto.setShortDescription(entity.getShortDescription());
        dto.setThumbnail(entity.getThumbnail());
        return dto;
    }
}

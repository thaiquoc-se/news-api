package com.example.Test.service;

import com.example.Test.dto.NewDTO;

public interface INewService {
    NewDTO save(NewDTO newDTO);
    NewDTO update(NewDTO newDTO);
}

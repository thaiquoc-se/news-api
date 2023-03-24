package com.example.Test.api;

import com.example.Test.dto.NewDTO;
import com.example.Test.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class NewAPI {

    @Autowired
    private INewService newService;

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return newService.save(model);
    }

    @PutMapping(value = "/new/{id}")

    public NewDTO updateNew(@RequestBody NewDTO model,@PathVariable("id")Long id) {
        model.setId(id);
        return newService.update(model);
    }

    @DeleteMapping (value = "/new")

    public void deleteNew(@RequestBody Long ids) {

    }
}

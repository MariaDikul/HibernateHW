package ru.netology.hibernatehw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatehw.repository.RepositoryForData;

@RestController
public class ControllerForData {
    private RepositoryForData repositoryForData;

    public ControllerForData(RepositoryForData repositoryForData) {
        this.repositoryForData = repositoryForData;
    }

    @GetMapping("/persons/by-city")
    public Object getPersons(@RequestParam("city") String city) {
        return repositoryForData.getPersonsByCity(city);
    }
}

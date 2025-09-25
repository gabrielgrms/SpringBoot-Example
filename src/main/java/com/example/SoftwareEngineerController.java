package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;
    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }
    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getAllEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(
            @PathVariable Integer id
    ){
        return softwareEngineerService.getEngineers(id);
    }

    @PostMapping
    public void addSoftwareEngineer(
            @RequestBody SoftwareEngineer softwareEngineer
    ){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}

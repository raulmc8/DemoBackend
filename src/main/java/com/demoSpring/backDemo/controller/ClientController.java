package com.demoSpring.backDemo.controller;

import com.demoSpring.backDemo.model.Client;
import com.demoSpring.backDemo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/add")
    public String add (@RequestBody Client client){
        clientService.saveClient(client);
        return "New client added";
    }

    @GetMapping("/getAll")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }
}

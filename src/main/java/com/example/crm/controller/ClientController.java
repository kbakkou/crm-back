package com.example.crm.controller;

import com.example.crm.model.Client;
import com.example.crm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("")
    public List<Client> recupererClients(){
        List<Client> clients = clientService.findAll();
        return clients;
    }

    @PostMapping("")
    public void saveClient(@RequestBody Client client){
        clientService.save(client);
    }
    @GetMapping("/{id}")
    public Client recupererClientById(@PathVariable Integer id){
        return clientService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Integer id){
        clientService.delete(id);
    }
    @PutMapping("/{id}")
    public void updateClient(@PathVariable Integer id, @RequestBody Client client){
        clientService.update(id, client);
    }
}

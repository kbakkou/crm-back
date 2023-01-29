package com.example.crm.service;

import com.example.crm.model.Client;
import com.example.crm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public Client findById(Integer id) {
        return clientRepository.findById(id).get();
    }

    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }

    public void update(Integer id, Client client) {
        clientRepository.save(client);
    }
}

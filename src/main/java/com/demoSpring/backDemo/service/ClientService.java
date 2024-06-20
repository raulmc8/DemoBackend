package com.demoSpring.backDemo.service;

import com.demoSpring.backDemo.model.Client;

import java.util.List;

public interface ClientService {
    public Client saveClient(Client client);
    public List<Client> getAllClients();

    public Client getClient(int id);

    public void deleteClient(int id);

}

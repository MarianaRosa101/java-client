package com.fatec.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.client.entities.Client;

@RestController
public class ClientController {

    @GetMapping("client")
    public Client getClient() {
        Client c = new Client(1,"maria@gmail.com","maria");
        return c;

    }

    @GetMapping("clients")
    public List<Client> getClients() {
        List <Client> clients = new ArrayList<Client>();

        Client c1 = new Client(1,"joão@gmail.com","João");
        Client c2 = new Client(2,"maria@gmail.com","Maria");

        clients.add(c1);
        clients.add(c2);

        return clients;
    }
}

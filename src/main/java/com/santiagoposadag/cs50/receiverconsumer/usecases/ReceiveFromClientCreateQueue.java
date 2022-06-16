package com.santiagoposadag.cs50.receiverconsumer.usecases;

import com.google.gson.Gson;
import com.santiagoposadag.cs50.receiverconsumer.collections.ClientEntity;
import com.santiagoposadag.cs50.receiverconsumer.repository.ClientRepository;
import org.springframework.stereotype.Component;

@Component
public class ReceiveFromClientCreateQueue {
    private final Gson gson = new Gson();
    private final ClientRepository repository;

    public ReceiveFromClientCreateQueue(ClientRepository repository){
        this.repository = repository;
    }

    public void receiveMessage(String message){
        System.out.println(message);
        ClientEntity client = gson.fromJson(message, ClientEntity.class);
        repository.save(client).subscribe();
    }
}

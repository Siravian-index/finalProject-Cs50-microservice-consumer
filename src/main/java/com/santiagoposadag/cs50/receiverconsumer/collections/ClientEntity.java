package com.santiagoposadag.cs50.receiverconsumer.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class ClientEntity {
    @Id
    private String id;
    private String name;
    private String dni;
    private String phone;
    private String routingKey;
}

package com.example.kafka.exemplo.produto;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "ecommerce.x", groupId = "group")
    public void consumer(Produto produto){
        System.out.print("Novo produto consumido: ");
        System.out.println(produto);
    }
}

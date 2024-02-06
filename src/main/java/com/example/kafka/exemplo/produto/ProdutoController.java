package com.example.kafka.exemplo.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    private KafkaTemplate<String, Produto> kafkaTemplate;

    @GetMapping("/produtor/{message}/{name}")
    public void produtor(@PathVariable String message, @PathVariable String name){
        var produto = new Produto(message, name);

        kafkaTemplate.send("ecommerce.x", produto);
    }
}

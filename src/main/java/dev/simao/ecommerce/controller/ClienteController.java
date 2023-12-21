package dev.simao.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.simao.ecommerce.model.Cliente;
import dev.simao.ecommerce.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin("*")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> obterTodos(){
        return clienteService.obterTodos();
    }

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clienteService.adicionar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        return clienteService.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        clienteService.deletar(id);
    }

    @GetMapping("/{id}")
    public Cliente obterPorId(@PathVariable Long id){
        return clienteService.obterPorId(id);
    }

}

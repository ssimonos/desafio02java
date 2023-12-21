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

import dev.simao.ecommerce.model.Categoria;
import dev.simao.ecommerce.service.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin("*")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> obterTodos(){
        return categoriaService.obterTodos();
    }

    @PostMapping
    public Categoria adicionar(@RequestBody Categoria categoria){
        return categoriaService.adicionar(categoria);
    }

    @PutMapping("/{id}")
    public Categoria atualizar(@PathVariable Long id, @RequestBody Categoria categoria){
        return categoriaService.atualizar(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        categoriaService.deletar(id);
    }

    @GetMapping("/{id}")
    public Categoria obterPorId(@PathVariable Long id){
        return categoriaService.obterPorId(id);
    }
}

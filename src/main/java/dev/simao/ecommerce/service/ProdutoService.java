package dev.simao.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.simao.ecommerce.model.Produto;
import dev.simao.ecommerce.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto adicionar (Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> obterTodos(){
        return produtoRepository.findAll();
    }

    public Produto atualizar (Long id, Produto produto){
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }

    public Produto obterPorId(Long id){

        Optional<Produto> optProduto = produtoRepository.findById(id);

        if(optProduto.isEmpty()){
            throw new IllegalArgumentException("Não existe um produto com o ID "+ id);
        }

        return optProduto.get();
    }

}

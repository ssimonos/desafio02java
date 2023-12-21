package dev.simao.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.simao.ecommerce.model.Endereco;
import dev.simao.ecommerce.repository.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco adicionar (Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> obterTodos(){
        return enderecoRepository.findAll();
    }

    public Endereco atualizar (Long id, Endereco endereco){
        endereco.setId(id);
        return enderecoRepository.save(endereco);
    }

    public void deletar(Long id){
        enderecoRepository.deleteById(id);
    }

    public Endereco obterPorId(Long id){

        Optional<Endereco> optEndereco = enderecoRepository.findById(id);

        if(optEndereco.isEmpty()){
            throw new IllegalArgumentException("Não existe um endereco com o ID "+ id);
        }

        return optEndereco.get();
    }
}

package edu.dio.padroesdeprojetospring.service;

import edu.dio.padroesdeprojetospring.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Optional<Cliente> buscarPorid(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}

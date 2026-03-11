package br.com.senai.sistema_ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.sistema_ecommerce.entity.Cliente;
import br.com.senai.sistema_ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
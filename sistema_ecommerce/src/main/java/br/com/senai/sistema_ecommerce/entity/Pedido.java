package br.com.senai.sistema_ecommerce.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Pedido {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private LocalDate datapedido;

    private Integer quantidade;

    private String status;


    @ManyToOne
    @JoinColumn(name ="cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(LocalDate datapedido) {
        this.datapedido = datapedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    


    
}

package com.spsoftware.estacionamentosp.model;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "TB_CLIENTES")

public class ClienteModel extends RepresentationModel<ClienteModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCliente;

    private String nome;
    private String sobrenome;
    private String telefone;
    private String placaVeiculo;
    private String modeloVeiculo;
    private String marcaVeiculo;
    private String tipoUso;
    private BigDecimal valorUso;
    private String tipoPagamento;
    private BigDecimal horaEntrada;
    private BigDecimal horaSaida;
    private Date dataEntrada;
    private Date dataSaida;

    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public BigDecimal getValorUso() {
        return valorUso;
    }

    public void setValorUso(BigDecimal valorUso) {
        this.valorUso = valorUso;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public BigDecimal getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(BigDecimal horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public BigDecimal getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(BigDecimal horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }
}
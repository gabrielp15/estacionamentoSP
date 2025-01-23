package com.spsoftware.estacionamentosp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public record RegistroClienteDto(@NotBlank String nome, String sobrenome, String telefone, String placaVeiculo, String modeloVeiculo, String marcaVeiculo, String tipoUso, String tipoPagamento, @NotNull BigDecimal valorUso, BigDecimal horaEntrada, BigDecimal horaSaida, Date dataEntrada, Date dataSaida) {
}
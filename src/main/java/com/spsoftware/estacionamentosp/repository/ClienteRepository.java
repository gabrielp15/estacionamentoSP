package com.spsoftware.estacionamentosp.repository;

import com.spsoftware.estacionamentosp.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, UUID> {

}

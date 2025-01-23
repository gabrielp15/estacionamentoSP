package com.spsoftware.estacionamentosp.controllers;

import com.spsoftware.estacionamentosp.dto.RegistroClienteDto;
import com.spsoftware.estacionamentosp.model.ClienteModel;
import com.spsoftware.estacionamentosp.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/cliente/new")
    public ResponseEntity <ClienteModel> saveCliente(@RequestBody @Valid RegistroClienteDto RegistroClienteDto) {
       var ClienteModel = new ClienteModel();
       this ClienteModel.getDataEntrada() = novaDataEntrada;    
        BeanUtils.copyProperties(RegistroClienteDto, ClienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(ClienteModel));
    }

    @GetMapping("/cliente/all")
    public ResponseEntity <List<ClienteModel>> getAllClientes() {
        List<ClienteModel> clienteList = clienteRepository.findAll();
        if (!clienteList.isEmpty()) {
            for (ClienteModel cliente: clienteList) {
                UUID id = cliente.getIdCliente();
                cliente.add(linkTo(methodOn(ClienteController.class).getOneCliente(id)).withSelfRel());
            }
        }
        return ResponseEntity.status(HttpStatus.OK).body(clienteList);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Object> getOneCliente(@PathVariable (value = "id") UUID id) {
        Optional<ClienteModel> cliente0 = clienteRepository.findById(id);
        if (cliente0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        cliente0.get().add(linkTo(methodOn(ClienteController.class).getAllClientes()).withRel("Lista de Clientes"));
        return ResponseEntity.status(HttpStatus.OK).body(cliente0.get());
    }

    @PutMapping("/cliente/update/{id}")
    public ResponseEntity<Object> updateCliente(@PathVariable(value = "id") UUID id, @RequestBody @Valid RegistroClienteDto RegistroClienteDto) {
        Optional<ClienteModel> cliente0 = clienteRepository.findById(id);
        if (cliente0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        var clienteModel = cliente0.get();
        BeanUtils.copyProperties(RegistroClienteDto, clienteModel);
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.save(clienteModel));
        }

    @DeleteMapping("/cliente/delete/{id}")
    public ResponseEntity<Object> deleteCliente(@PathVariable (value = "id") UUID id) {
        Optional<ClienteModel> cliente0 = clienteRepository.findById(id);
        if (cliente0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        clienteRepository.delete(cliente0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cliente deletado com sucesso");
    }
}
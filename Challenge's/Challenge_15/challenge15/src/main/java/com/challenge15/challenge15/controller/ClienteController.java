package com.challenge15.challenge15.controller;

import com.challenge15.challenge15.model.Cliente;
import com.challenge15.challenge15.repository.ClienteRepository;
import com.challenge15.challenge15.exception.ResourceNotFoundException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import menssage.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    PasswordEncoder encoder;

    @ApiOperation(value = "Listar Clientes", notes="Notas....")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Listado de Clientes", response= Cliente.class),
            @ApiResponse(code = 500, message = "Error Server"),
            @ApiResponse(code = 400, message = "no encotro datos")
    })
    @GetMapping
    public List<Cliente> getAllCliente() {
        return this.clienteRepository.findAll();
    }


    @ApiOperation(value = "Buscar Cliente por id", notes="Notas....")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Cliente encontrado", response= Cliente.class),
            @ApiResponse(code = 500, message = "Error Server"),
            @ApiResponse(code = 400, message = "no encotro datos")
    })
    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable(value = "id") String clienteId) {
        return this.clienteRepository.findById(clienteId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + clienteId));
    }


    @ApiOperation(value = "Agrega Cliente", notes= "Agrega un Cliente, agregado por el Body")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Cliente agregado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "Cliente x body")
    @PostMapping
    public ResponseEntity<?> createCliente(@Valid @RequestBody Cliente cliente) {

        if( clienteRepository.existsByDni(cliente.getDni()) )  {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: El dni existe"));
        }
        cliente.setDni(encoder.encode(cliente.getDni()));
        clienteRepository.save(cliente);
        return ResponseEntity.ok(new MessageResponse("Cliente Registrado Correctamente"));
    }

    @ApiOperation(value = "modifica Cliente", notes= "Modifica un Cliente pasando el id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Cliente modificado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "id")
    @PutMapping("/{id}")
    public Cliente updateProducto(@RequestBody Cliente cliente, @PathVariable ("id") String clienteId) {
        Cliente addCliente = this.clienteRepository.findById(clienteId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found" + clienteId));

        addCliente.setDni(cliente.getDni());
        addCliente.setNombre(cliente.getNombre());
        addCliente.setEmail(cliente.getEmail());
        addCliente.setApellido(cliente.getApellido());
        addCliente.setTeléfono(cliente.getTeléfono());

        return this.clienteRepository.save(addCliente);
    }

    @ApiOperation(value = "Elimina Cliente", notes= "Elimina un Cliente pasando el dni")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Cliente eliminado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deleteProducto(@PathVariable ("id") String clienteId){
        Cliente existingCliente = this.clienteRepository.findById(clienteId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found:" + clienteId));
        this.clienteRepository.delete(existingCliente);
        return ResponseEntity.ok().build();
    }
}

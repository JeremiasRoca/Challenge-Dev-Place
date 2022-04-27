package com.challenge15.challenge15.controller;

import com.challenge15.challenge15.model.Usuario;
import com.challenge15.challenge15.repository.UserRepository;
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
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder encoder;

    @ApiOperation(value = "Listar usuario", notes="Notas....")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Listado de usuarios", response= Usuario.class),
            @ApiResponse(code = 500, message = "Error Server"),
            @ApiResponse(code = 400, message = "no encotro datos")
    })
    @GetMapping
    public List<Usuario> getAllUsers() {
        return this.userRepository.findAll();
    }


    @ApiOperation(value = "Buscar usuario por id", notes="Notas....")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, usuario encontrado", response= Usuario.class),
            @ApiResponse(code = 500, message = "Error Server"),
            @ApiResponse(code = 400, message = "no encotro datos")
    })
    @GetMapping("/{id}")
    public Usuario getUserById(@PathVariable(value = "id") String userId) {
        return this.userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + userId));
    }


    @ApiOperation(value = "Agrega usuario", notes= "Agrega un usuario, agregado por el Body")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Usuario agregado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "usuario x body")
    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody Usuario user) {

        if( userRepository.existsByEmail(user.getEmail()) )  {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: El email existe"));
        }
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok(new MessageResponse("Usuario Registrado Correctamente"));
    }

    @ApiOperation(value = "modifica usuario", notes= "Elimina un usuario pasando el id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Usuario modificado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "id")
    @PutMapping("/{id}")
    public Usuario updateUser(@RequestBody Usuario user, @PathVariable ("id") String userId) {
        Usuario addUsers = this.userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found" + userId));


        addUsers.setNombre(user.getNombre());
        addUsers.setApellido(user.getApellido());
        addUsers.setEmail(user.getEmail());
        addUsers.setPassword(user.getPassword());
        return this.userRepository.save(addUsers);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deleteUser(@PathVariable ("id") String userId){
        Usuario existingUser = this.userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found:" + userId));
        this.userRepository.delete(existingUser);
        return ResponseEntity.ok().build();
    }
}

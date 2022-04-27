package com.clase13.controller;


import java.util.ArrayList;
import java.util.List;

import com.clase13.model.User;
import com.mongodb.client.model.ValidationAction;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.clase13.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository ur;

    @ApiOperation(value = "Muestra todos", notes= "Muestra todos  los usuarios")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Listado de usuarios"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Datos no encontrados")
    })
       @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll(){
        try {
            List<User> users=new ArrayList<User>();
            ur.findAll().forEach(users::add);
            if(users.isEmpty()) { return new ResponseEntity<>(HttpStatus.NO_CONTENT); }
            return new ResponseEntity<>(users,HttpStatus.OK);
        }catch( Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Muestra usuario", notes= "Muestra un usuario pasando el dni")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Usuario encontrado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "dni")
    @GetMapping("/getOne/{dni}")
    public ResponseEntity<List<User>> getOneByDni(@PathVariable("dni") int dni){
        try {
            List<User> users=new ArrayList<User>();
            ur.findByDni(dni).forEach(users::add);
            if(users.isEmpty()) { return new ResponseEntity<>(HttpStatus.NO_CONTENT); }
            return new ResponseEntity<>(users,HttpStatus.OK);
        }catch( Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Agrega usuario", notes= "Agrega un usuario, agregado por el Body")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Usuario agregado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "usuario x body")
    @PostMapping("/add")
    public ResponseEntity<User> addOne(@Valid @RequestBody User users){
        try {
            User user=ur.save(new User(users.getNombre(), users.getApellido(), users.getDireccion(), users.getDni()));
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }catch( Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @ApiOperation(value = "modifica usuario", notes= "Elimina un usuario pasando el dni")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Usuario modificado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "dni")
    @PutMapping("/actualizar/{dni}")
    public ResponseEntity<User> updateOne(@RequestBody User users,@PathVariable("dni") int dni){
        try {
            List<User> nUser=new ArrayList<User>();
            ur.findByDni(dni).forEach(nUser::add);
            if(!nUser.isEmpty()) { users.setDni(dni); ur.save(users);
                return new ResponseEntity<>(users, HttpStatus.OK);
            }
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }catch( Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Elimina usuario", notes= "Elimina un usuario pasando el dni")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Usuario eliminado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "dni")
    @DeleteMapping("/delete/{dni}")
    public ResponseEntity<User> deleteOne(@PathVariable("dni") int dni){
        try {
            List<User> users=new ArrayList<User>();
            ur.findByDni(dni).forEach(users::add);
            User user= users.get(0);
            ur.delete(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }catch( Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

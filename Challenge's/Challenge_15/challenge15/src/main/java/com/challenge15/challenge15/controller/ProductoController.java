package com.challenge15.challenge15.controller;

import com.challenge15.challenge15.model.Producto;
import com.challenge15.challenge15.repository.ProductoRepository;
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
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoRepository productoRepository;
    @Autowired
    PasswordEncoder encoder;

    @ApiOperation(value = "Listar producto", notes="Notas....")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Listado de productos", response= Producto.class),
            @ApiResponse(code = 500, message = "Error Server"),
            @ApiResponse(code = 400, message = "no encotro datos")
    })
    @GetMapping
    public List<Producto> getAllProducto() {
        return this.productoRepository.findAll();
    }


    @ApiOperation(value = "Buscar Producto por id", notes="Notas....")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Producto encontrado", response= Producto.class),
            @ApiResponse(code = 500, message = "Error Server"),
            @ApiResponse(code = 400, message = "no encotro datos")
    })
    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable(value = "id") String productoId) {
        return this.productoRepository.findById(productoId)
                .orElseThrow(() -> new ResourceNotFoundException("Producto not found with id :" + productoId));
    }


    @ApiOperation(value = "Agrega Producto", notes= "Agrega un Producto, agregado por el Body")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Producto agregado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "Producto x body")
    @PostMapping
    public ResponseEntity<?> createProducto(@Valid @RequestBody Producto producto) {

        if( productoRepository.existsByCodigo(producto.getCódigo()) )  {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: El codigo existe"));
        }
        producto.setCódigo(encoder.encode(producto.getCódigo()));
        productoRepository.save(producto);
        return ResponseEntity.ok(new MessageResponse("Producto Registrado Correctamente"));
    }

    @ApiOperation(value = "modifica Producto", notes= "Modifica un Producto pasando el id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Producto modificado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "id")
    @PutMapping("/{id}")
    public Producto updateProducto(@RequestBody Producto producto, @PathVariable ("id") String productoId) {
        Producto addProducto = this.productoRepository.findById(productoId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found" + productoId));


        addProducto.setNombre(producto.getNombre());
        addProducto.setCódigo(producto.getCódigo());
        addProducto.setCantidad(producto.getCantidad());
        addProducto.setPrecio(producto.getPrecio());
        return this.productoRepository.save(addProducto);
    }

    @ApiOperation(value = "Elimina Producto", notes= "Elimina un Producto pasando el dni")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Producto eliminado"),
            @ApiResponse(code = 500, message = "Error server"),
            @ApiResponse(code = 400, message = "Dato no encontrado")
    })
    @ApiParam(value = "id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Producto> deleteProducto(@PathVariable ("id") String productoId){
        Producto existingProducto = this.productoRepository.findById(productoId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found:" + productoId));
        this.productoRepository.delete(existingProducto);
        return ResponseEntity.ok().build();
    }
}

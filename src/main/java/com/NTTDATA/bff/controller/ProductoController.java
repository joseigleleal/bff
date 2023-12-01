package com.NTTDATA.bff.controller;

import com.NTTDATA.bff.modelo.Producto;
import com.NTTDATA.bff.modelo.Usuario;
import com.NTTDATA.bff.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProductoPorId(@PathVariable Long id) {
        // Lógica para obtener el producto por ID
    }

    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<Producto>> obtenerProductosPorCategoria(@PathVariable String categoria) {
        // Lógica para obtener productos por categoría
    }

    @PostMapping
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto) {
        // Lógica para crear un producto
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> editarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        // Lógica para editar un producto
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        // Lógica para eliminar un producto
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        // Lógica para generar un token JWT
    }
}
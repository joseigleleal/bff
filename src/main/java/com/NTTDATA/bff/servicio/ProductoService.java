package com.NTTDATA.bff.servicio;

import com.NTTDATA.bff.repositorio.ProductoRepository;
import com.NTTDATA.bff.modelo.Producto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Cacheable("products")
    public Producto obtenerProductoPorId(Long id) {
        // Lógica para obtener el producto por ID desde la base de datos
    }

    // Otros métodos de servicio para CRUD
}
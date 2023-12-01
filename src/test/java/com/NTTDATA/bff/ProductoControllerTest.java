package com.NTTDATA.bff;

import com.NTTDATA.bff.controller.ProductoController;
import com.NTTDATA.bff.modelo.Producto;
import com.NTTDATA.bff.servicio.ProductoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductoControllerTest {

    @Mock
    private ProductoService productoService;

    @InjectMocks
    private ProductoController productoController;

    @Test
    public void testObtenerProductoPorIdExistente() {
        Long idProducto = 1L;
        Producto productoMock = new Producto();
        productoMock.setId(idProducto);
        productoMock.setNombre("Producto de Prueba");
        productoMock.setCategoria("Electrónicos");
        productoMock.setPrecio(100.0);

        Mockito.when(productoService.obtenerProductoPorId(idProducto)).thenReturn(productoMock);

        ResponseEntity<Producto> respuesta = productoController.obtenerProductoPorId(idProducto);

        // Verifica que la respuesta sea exitosa (código 200)
        assertEquals(200, respuesta.getStatusCodeValue());

        // Verifica que el cuerpo de la respuesta tenga los valores esperados
        Producto cuerpoRespuesta = respuesta.getBody();
        assertNotNull(cuerpoRespuesta);
        assertEquals(idProducto, cuerpoRespuesta.getId());
        assertEquals("Producto de Prueba", cuerpoRespuesta.getNombre());
        assertEquals("Electrónicos", cuerpoRespuesta.getCategoria());
        assertEquals(100.0, cuerpoRespuesta.getPrecio());
    }


}

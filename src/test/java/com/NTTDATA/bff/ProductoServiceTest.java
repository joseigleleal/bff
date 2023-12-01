package com.NTTDATA.bff;

import com.NTTDATA.bff.modelo.Producto;
import com.NTTDATA.bff.repositorio.ProductoRepository;
import com.NTTDATA.bff.servicio.ProductoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    @Test
    public void testObtenerProductoPorIdExistente() {
        Long idProducto = 1L;
        Producto productoMock = new Producto();
        productoMock.setId(idProducto);
        productoMock.setNombre("Producto de Prueba");
        productoMock.setCategoria("Electrónicos");
        productoMock.setPrecio(100.0);

        Mockito.when(productoRepository.findById(idProducto)).thenReturn(Optional.of(productoMock));

        Producto resultado = productoService.obtenerProductoPorId(idProducto);

        // Verifica que se haya llamado al método de repositorio con el ID esperado
        Mockito.verify(productoRepository).findById(idProducto);

        // Verifica que el resultado no sea nulo y tenga los valores esperados
        assertNotNull(resultado);
        assertEquals(idProducto, resultado.getId());
        assertEquals("Producto de Prueba", resultado.getNombre());
        assertEquals("Electrónicos", resultado.getCategoria());
        assertEquals(100.0, resultado.getPrecio());
    }


}

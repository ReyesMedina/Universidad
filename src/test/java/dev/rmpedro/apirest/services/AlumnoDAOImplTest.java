package dev.rmpedro.apirest.services;

import dev.rmpedro.apirest.repositories.AlumnoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class AlumnoDAOImplTest {

    @MockBean
    private AlumnoRepository alumnoRepository;

    @Autowired
    AlumnoDAO alumnoDAO;


    @Test
    void buscarAlumnoPorNombreCarrera() {
        //when
        alumnoDAO.buscarAlumnoPorNombreCarrera(anyString());
        //then
        verify(alumnoRepository).buscarAlumnoPorNombreCarrera(anyString());
    }
}
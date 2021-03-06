package dev.rmpedro.apirest.datos;

import dev.rmpedro.apirest.models.entities.Carrera;
import dev.rmpedro.apirest.models.entities.Profesor;
import org.checkerframework.checker.units.qual.C;

import java.util.HashSet;
import java.util.Set;

public class CarreraDatosDummy {

    public static Carrera carrera01(){
        return new Carrera(1,"Ingenieria en Sistemas",50,5);

    }

    public static Carrera carrera02(){
        return new Carrera(2,"Licenciatura en Medicina",55,6);

    }

    public static Carrera carrera03(){
        Carrera carrera = new Carrera(3,"Licenciatura en Agronegocios",45,4);
        Set<Profesor> profesores = new HashSet<>();
        profesores.add(ProfesorDatosDummy.profesor02());
        carrera.setProfesores(profesores);
        return carrera;
    }
    public static Carrera carrera04(){
        return new Carrera(4, "Ingenieria en Telematica", 45, 4);



    }
}

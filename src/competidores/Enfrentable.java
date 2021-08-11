package competidores;

import comparator.Comparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class Enfrentable {
    protected String nombre;
    protected String nombreFantasia;

    public Enfrentable(String nombre, String nombreFantasia) {
        this.nombre = nombre;
        this.nombreFantasia = nombreFantasia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    public Enfrentable enfrentar(Enfrentable e, Comparator<Enfrentable> c) {
        return this.enfrentar(e,c);
    }

    public List<Personaje> ordenar(Comparator<Enfrentable> c) {
        return ordenar(c).stream().toList();
        //        return this.ordenar(c);
    }
    public abstract float getValorAtributo(String key);

    protected abstract List<Personaje> getPersonajes();


}


package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Juguete;

public interface JugueteService {
    public abstract Juguete agregarJuguete(String nombre,String material,double precio,int existencia);
    public abstract int totalJuguetes(Juguete[] juguetes);
    public abstract double valorTotal(Juguete[]juguetes);
    public abstract String juguetesPorCategoria(Juguete[]juguetes);
    public abstract String categoriaMasJuguetes(Juguete[]juguetes);
    public abstract String categoriaMenosJuguetes(Juguete[]juguetes);
    public abstract String valorMayorA(Juguete[]juguetes);
}

package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Material;
import co.edu.cue.jugueteria.model.Menu;
import co.edu.cue.jugueteria.services.impl.JugueteServiceImpl;

import javax.swing.*;

public class JugueteController {

    JugueteServiceImpl juguete = new JugueteServiceImpl();

    public void agregarJuguete(Juguete[] array, int contJuguete){
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de el Juguete");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de el Juguete"));
        int existencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de existencias de el Juguete"));
        int material = Integer.parseInt(JOptionPane.showInputDialog(Menu.menuMaterial));
        switch (material){
            case 1:
                array[contJuguete]=juguete.agregarJuguete(nombre, Material.PLASTICO,precio,existencia);
                break;
            case 2:
                array[contJuguete]=juguete.agregarJuguete(nombre, Material.TELA,precio,existencia);
                break;
            case 3:
                array[contJuguete]=juguete.agregarJuguete(nombre, Material.ELECTRONIC,precio,existencia);
                break;
        }
    }

    public void aumentarExistencia(Juguete[]juguetes){
        String nameJ = JOptionPane.showInputDialog("Ingrese el juguete de el que desea aumentar existencias");
        for (Juguete juguete:juguetes){
            if (String.valueOf(juguete)!="null"){
                if (nameJ.equals(juguete.getNombre())){
                    int cantidadNueva = 0;
                    int aumento = Integer.parseInt(JOptionPane.showInputDialog("Juguete "+juguete.getNombre()+" con "+juguete.getExistencia()+" existencias \n" +
                            "¿Cuantas Existencias desea aumentar?"));

                }
            }
        }
    }
    public void disminuirExistencia(Juguete[]juguetes){

    }
}

package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.JugueteService;

import javax.swing.*;

public class JugueteServiceImpl implements JugueteService {

    @Override
    public Juguete agregarJuguete(String nombre, String material, double precio, int existencia) {
        return new Juguete(nombre,material,precio,existencia);
    }

    @Override
    public int totalJuguetes(Juguete[] juguetes) {
        int totalJuguetes = 0;
        if(juguetes!=null){
            for (Juguete juguete:juguetes){
                if (String.valueOf(juguete)!="null"){
                    totalJuguetes+=juguete.getExistencia();
                }
            }

        }
        return totalJuguetes;
    }

    @Override
    public double valorTotal(Juguete[] juguetes) {
        int valorTotal = 0;
        for (Juguete juguete:juguetes){
            if(String.valueOf(juguete)!="null"){
                valorTotal+=juguete.getPrecio();
            }
        }
        return valorTotal;
    }

    @Override
    public String juguetesPorCategoria(Juguete[] juguetes) {
        String resultado;
        int[] contadorCategorias = new int[3];
        contadorCategorias[0]=0;
        contadorCategorias[1] = 0;
        contadorCategorias[2]=0;
        for (Juguete juguete:juguetes){
            if(String.valueOf(juguete)!="null"){
                if ("Plastico".equals(juguete.getMaterial())){
                    contadorCategorias[0]+= juguete.getExistencia();
                } else if ("Tela".equals(juguete.getMaterial())) {
                    contadorCategorias[1]+=juguete.getExistencia();
                } else if ("Electronico".equals(juguete.getMaterial())) {
                    contadorCategorias[2]+=juguete.getExistencia();
                }
            }
        }
        resultado = "Plastico - "+contadorCategorias[0]+"\n" +
                "Tela - "+contadorCategorias[1]+"\n" +
                "Electronico - "+contadorCategorias[2];
        return resultado;
    }

    @Override
    public String categoriaMasJuguetes(Juguete[] juguetes) {
        int mayor = 0;
        int[] contadorCategorias = new int[3];
        contadorCategorias[0]=0;
        contadorCategorias[1] = 0;
        contadorCategorias[2]=0;
        for (Juguete juguete:juguetes){
            if(String.valueOf(juguete)!="null"){
                if ("Plastico".equals(juguete.getMaterial())){
                    contadorCategorias[0]+= juguete.getExistencia();
                } else if ("Tela".equals(juguete.getMaterial())) {
                    contadorCategorias[1]+=juguete.getExistencia();
                } else if ("Electronico".equals(juguete.getMaterial())) {
                    contadorCategorias[2]+=juguete.getExistencia();
                }
            }
        }
        int iteracion = 0;
        for (int i=0;i<contadorCategorias.length-1;i++){
            if (contadorCategorias[i]>mayor){
                mayor = contadorCategorias[i];
                iteracion = i;
            }
        }
        String resultado = "";
        switch (iteracion){
            case 0:
                resultado = "Plastico con "+contadorCategorias[iteracion]+" existencias";
                break;
            case 1:
                resultado = "Tela con "+contadorCategorias[iteracion]+" existencias";
                break;
            case 2:
                resultado = "Electronico con "+contadorCategorias[iteracion]+" existecias";
                break;
        }
        return resultado;
    }

    @Override
    public String categoriaMenosJuguetes(Juguete[] juguetes) {
        int menor = 0;
        int[] contadorCategorias = new int[3];
        contadorCategorias[0]=0;
        contadorCategorias[1] = 0;
        contadorCategorias[2]=0;
        for (Juguete juguete:juguetes){
            if(String.valueOf(juguete)!="null"){
                if ("Plastico".equals(juguete.getMaterial())){
                    contadorCategorias[0]+= juguete.getExistencia();
                } else if ("Tela".equals(juguete.getMaterial())) {
                    contadorCategorias[1]+=juguete.getExistencia();
                } else if ("Electronico".equals(juguete.getMaterial())) {
                    contadorCategorias[2]+=juguete.getExistencia();
                }
            }
        }
        int iteracion = 0;
        for (int i=0;i<contadorCategorias.length;i++){
            if (contadorCategorias[i]<=menor){
                menor = contadorCategorias[i];
                iteracion = i;
            }
        }
        String resultado = "";
        switch (iteracion){
            case 0:
                resultado = "Plastico con "+contadorCategorias[iteracion]+" existencias";
                break;
            case 1:
                resultado = "Tela con "+contadorCategorias[iteracion]+" existencias";
                break;
            case 2:
                resultado = "Electronico con "+contadorCategorias[iteracion]+" existecias";
                break;
        }
        return resultado;
    }

    @Override
    public String valorMayorA(Juguete[] juguetes) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor"));
        int mayores = 0;
        for (Juguete juguete:juguetes){
            if (String.valueOf(juguete)!="null"){
                if (juguete.getPrecio()>valor){
                    mayores++;
                }
            }
        }
        return "Hay "+mayores+" juguetes con valor mayor a "+valor;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repartidor_;

import Empleado.Empleado;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 8/06/2021
 *
 */
public class Repartidor extends Empleado {

    private String zona;

    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public boolean havePlusSalario() {
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("LIMA".trim())) {
            double n = super.getSalario() + Empleado.getPLUS();
            super.setSalario(n);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nZona: " + zona;
    }

}

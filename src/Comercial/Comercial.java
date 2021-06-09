/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial;

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
public class Comercial extends Empleado {

    private double comision;

    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public boolean havePlusSalario() {
        if (super.getEdad() > 30 && this.comision > 200) {
            double n = super.getSalario() + Empleado.getPLUS();
            super.setSalario(n);
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return super.toString() + "\nComision: " + comision;
    }

}

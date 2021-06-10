/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecucion;

import Comercial.Comercial;
import Repartidor_.Repartidor;
import javax.swing.JOptionPane;

/**
 *
 * @author CxrlosMX
 */
public class Uso_empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, zona;
        int edad, op = 0;
        double salario, comision;
        Comercial c;
        Repartidor r;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "\n\tEMPLEADOS"
                        + "\n1.-Registrar Empleado Comercial"
                        + "\n2.-Registrar Empleado Repartidor"
                        + "\n3.-Salir\n¿Que desea realizar?", "MENU", 3));
                switch (op) {
                    case 1: {
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del Empleado", "Empleado Comercial", 1);
                        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad del Empleado", "Empleado Comercial", 1));
                        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el salario del empleado", "Empleado Comercial", 1));
                        comision = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la comision del Empleado", "Empleado Comercial", 1));
                        c = new Comercial(comision, nombre, edad, salario);
                        c.havePlusSalario();
                        JOptionPane.showMessageDialog(null,c.toString()); //Podemos usar la siguiente linea de codigo para y nos ahorramos el codigo siguiente
                       /* if (c.havePlusSalario()) {
                            JOptionPane.showMessageDialog(null, c.toString() + "\nEmpleado PLUS, su Salario es de:" + c.getSalario(), "Empleado PLUS", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "\n" + c.toString() + "\nNo Cumple con los requisitos para ser un Empleado Plus", "Empleado Comercial", 1);
                        }*/
                        break;
                    }
                    case 2: {
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del Empleado", "Empleado Repartidor", 1);
                        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad del Empleado", "Empleado Repartidor", 1));
                        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el salario del empleado", "Empleado Repartidor", 1));
                        zona = JOptionPane.showInputDialog(null, "Introduce la Zona del repartidor", "Empleado Repartidor", 1);
                        r = new Repartidor(zona, nombre, edad, salario);
                        if (r.havePlusSalario()) {
                            JOptionPane.showMessageDialog(null, r.toString() + "\nEmpleado PLUS, su Salario es de:" + r.getSalario(), "Empleado PLUS", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "\n" + r.toString() + "\nNo Cumple con los requisitos para ser un Empleado Plus", "Empleado Comercial", 1);
                        }
                        break;
                    }
                    case 3: {
                        JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA", "SALIENDO", 1);
                        break;
                    }

                    default: {
                        JOptionPane.showMessageDialog(null, "INTRODUCE VALORES VALIDOS POR FAVOR", "VALORES NO VALIDOS", 2);
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error", 0);
            }

        } while (op != 3);

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        //Cantidad de veces que solicita datos de factura
        String data0 = JOptionPane.showInputDialog("Digite cuantas facturas va a ingresar");
        int fact = Integer.parseInt(data0);
        
        //Definición de variables
        String data1 = JOptionPane.showInputDialog("Digite su nombre");
        String data2 = JOptionPane.showInputDialog("Digite su cedula");
        String data3;
        String data4;
        String data5 = "";
        String data6;
        String data7;
        
        double totalMonto = 0;
        double deuda = 0;
        double deudaXMes = 0;
        
        //Fila 1 para consola
        System.out.println("Nombre | Cedula | Cod | Mes | Ano | Monto | Estado");
        
        //Loop para facturas, se va a correr cuantas veces se haya ingresado en data0
        for (int i = 1; i <= fact ; i++) {
            data3 = JOptionPane.showInputDialog("Digite el codigo de la factura " + i);
            data4 = JOptionPane.showInputDialog("Digite el mes de la factura " + i);
            data5 = JOptionPane.showInputDialog("Digite el ano de la factura " + i);
            data6 = JOptionPane.showInputDialog("Digite el monto de la factura " + i);
            int monto = Integer.parseInt(data6);
            data7 = JOptionPane.showInputDialog("Digite el estado de la factura " + i + " (1= Pagada; 2= No pagada)");
            int estado = Integer.parseInt(data7);
            
            //Imprime en consola los datos ingresados
            System.out.println(data1+" | "+data2+" | "+data3+" | "+data4+" | "+data5+" | "+data6+" | "+data7);
            
            //Calcula el monto total, esta variable se actualiza por cada vez que corre el for
            totalMonto += monto;
            
            if (estado == 2) {
                totalMonto += monto;
            }
            
            //Operaciones contables para calculo de deuda y deuda por mes
            deuda = (totalMonto*0.15)+totalMonto;
            deudaXMes = deuda/4;
        }
        //Imprime al usuario un resumen de la deuda
        JOptionPane.showMessageDialog(null, "El total de la deuda es: " + deuda);
        String mensaje = "Couta 1: " + deudaXMes + "; Fecha de pago: marzo " + data5 + "\nCouta 2: " + deudaXMes + "; Fecha de pago: abril " + data5 + "\nCouta 3: " + deudaXMes + "; Fecha de pago: mayo " + data5 + "\nCouta 4: " + deudaXMes + "; Fecha de pago: junio " + data5;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

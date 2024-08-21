/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Ventas2 {
    int mes;
    double monto;
    
    public String Lmes(){
        String vec[]={"","Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sept","Oct","Nov", "Dic"};
        return vec[mes];
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class Venta1 {
    int idVentas;
    int idCliente;
    int idEmpleado;
    double monto;

    public Venta1() {
    }

    public Venta1(int idVentas, int idCliente, int idEmpleado, double monto) {
        this.idVentas = idVentas;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.monto = monto;
    }

    public int getId() {
        return idVentas;
    }

    public void setId(int id) {
        this.idVentas = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}

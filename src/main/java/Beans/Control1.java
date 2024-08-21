/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;
import Modelo.Cliente1;
import Modelo.Venta1;
import Config.MySQLConexion;
import Modelo.Empleado;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

@ManagedBean(name = "control1")
@SessionScoped
public class Control1 implements Serializable {

    private List<Cliente1> liscli;
    private List<Venta1> lisven;
    private List<Empleado> lisemp;
    private int id;

    @PostConstruct
    public void init() {
        lisven = new Negocio().LisVen();
    }

    public void verCliente(Venta1 a) {
        
        liscli = new ArrayList();
        liscli = new Negocio().LisCli(a.getIdCliente());
    }
    
    public void verEmpleado(Venta1 a) {
        
        lisemp = new ArrayList();
        lisemp = new Negocio().LisEmp(a.getIdEmpleado());
    }

    public List<Cliente1> getLiscli() {
        return liscli;
    }

    public void setLiscli(List<Cliente1> liscli) {
        this.liscli = liscli;
    }

    public List<Venta1> getLisven() {
        return lisven;
    }

    public void setLisven(List<Venta1> lisven) {
        this.lisven = lisven;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Empleado> getLisemp() {
        return lisemp;
    }

    public void setLisemp(List<Empleado> lisemp) {
        this.lisemp = lisemp;
    }
    
    
}

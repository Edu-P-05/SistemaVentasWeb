package Beans;

import java.sql.*;
import java.util.ArrayList;
import Config.MySQLConexion;
import Modelo.Cliente1;
import Modelo.Empleado;
import Modelo.Venta1;
import java.util.List;

public class Negocio {

    public List<Venta1> LisVen() {
        List<Venta1> lista = new ArrayList();
        String sql = "select idVentas, idCliente, idEmpleado, monto from ventas";
        try {
            PreparedStatement st = MySQLConexion.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Venta1 a = new Venta1(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4));
                lista.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public List<Cliente1> LisCli(int ida) {
        List<Cliente1> lista = new ArrayList();
        String sql = "SELECT idCliente, Dni, Nombres, Direccion, Estado FROM cliente WHERE idCliente = ?";
        try {
            PreparedStatement st = MySQLConexion.getConexion().prepareStatement(sql);
            st.setInt(1, ida);
            System.out.println(ida);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Cliente1 a = new Cliente1(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                lista.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public List<Empleado> LisEmp(int ide) {
        List<Empleado> lista = new ArrayList();
        String sql = "SELECT idEmpleado, Dni, Nombres, Telefono, Estado, User FROM empleado WHERE idEmpleado = ?";
        try {
            PreparedStatement st = MySQLConexion.getConexion().prepareStatement(sql);
            st.setInt(1, ide);
            System.out.println(ide);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Empleado a = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                lista.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}

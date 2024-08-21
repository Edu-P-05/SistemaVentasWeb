/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;

    public Cliente buscar(String dni) {
        Cliente c = new Cliente();
        String sql = "Select * from cliente where Dni=" + dni;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDirec(rs.getString(4));
                c.setEstado(rs.getString(5));
            }
            ps.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return c;
    }

    public List listar() {
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDirec(rs.getString(4));
                c.setEstado(rs.getString(5));
                lista.add(c);
            }
            ps.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return lista;
    }

    public int agregar(Cliente c) {
        String sql = "Insert into cliente(Dni, Nombres, Direccion, Estado)values(?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getDni());
            ps.setString(2, c.getNom());
            ps.setString(3, c.getDirec());
            ps.setString(4, c.getEstado());
            ps.executeUpdate();
            ps.close();
            con.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return r;

    }

    public Cliente listarId(int id) {
        Cliente c = new Cliente();
        String sql = "select * from cliente where IdCliente=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDirec(rs.getString(4));
                c.setEstado(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return c;
    }

    public int actualizar(Cliente c) {
        String sql = "update cliente set Dni=?, Nombres=?, Direccion=?, Estado=? where IdCliente=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getDni());
            ps.setString(2, c.getNom());
            ps.setString(3, c.getDirec());
            ps.setString(4, c.getEstado());
            ps.setInt(5, c.getId());
            ps.executeUpdate();
            ps.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from cliente where IdCliente=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
    }

    public ResultSet mostrar() {
        try {
            String sql = "select idCliente, Dni  from cliente";
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
}

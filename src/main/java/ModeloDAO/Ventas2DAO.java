/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.MySQLConexion;
import Modelo.Ventas2;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Ventas2DAO {
    public List<Ventas2> LisMes(int an) {
        List<Ventas2> lista = new ArrayList();
        String sql = "{call spmes(?)}";
        try {
            PreparedStatement st = MySQLConexion.getConexion().prepareStatement(sql);
            st.setInt(1, an);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Ventas2 p =new Ventas2();
                p.setMes(rs.getInt(1));
                p.setMonto(rs.getDouble(2));
                lista.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}

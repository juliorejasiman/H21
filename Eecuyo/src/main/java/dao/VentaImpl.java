package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import modelo.Venta;
import modelo.Destino;

public class VentaImpl extends Conexion implements ICRUD<Venta> {
    
    @Override
    public void registrar(Venta ven) throws Exception {
        String sql = "insert into venta ( CODCLI,CODEMP,TOTVEN) values (?,?,?)";
        try {
            PreparedStatement ps = this.conectar ().prepareStatement(sql);            
            ps.setInt(1, ven.getCODPIZ());            
            ps.setInt(2, ven.getCODVEDE());
            ps.setInt(3, ven.getCODVENT());
            
            
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al Ingresar Venta: " + e.getMessage());
        } finally {
            this.cerrar();
        }
    }
    
    @Override
    public void modificar(Venta ven) throws Exception {
        String sql = "update venta set COD=?,CODCLI=?,CODEMP=?,TOTVEN=?,CODUBI=?  where CODVEN=? ";
//        String sql = "update venta set CODCLI=?,CODEMP=?,TOTVEN=?CODUBI=?, where CODVEN=? ";        
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, ven.getCODPIZ());            
            ps.setInt(2, ven.getCODVEDE());            
            ps.setInt(3, ven.getCODVENT());                                         
          

//                      
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al Modificar Venta: " + e.getMessage());
        }
    }
    
    @Override
    public void eliminar(Venta ven) throws Exception {
        String sql = "delete from venta where CODVEN=?";        
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);            
            ps.setInt(1, ven.getCODVENT());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en eliminarD" + e.getMessage());
        } finally {
            this.cerrar();
        }
    }

    // dni_cli nom_cli cel_cli ape_cli dir_cli _per
    @Override
    public List listarTodos() throws Exception {
        List<Venta> listado = null;
        Venta ven;
        String sql = "select c.CODVEN,c.CODCLI,c.CODEMP,c.TOTVEN,u.CODUBI,u.DEPUBI,u.DISUBI,u.PROUBI" +
                      " from Venta c INNER JOIN Ubigeo u ON u.CODUBI =u.CODUBI;";
        
        try {
            listado = new ArrayList();
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ven = new Venta();
                ven.setCODVENT(rs.getInt("CODVENt"));
                ven.setCODVEDE(rs.getInt("CODVEDE"));
                ven.setCODPIZ(rs.getInt("CODPIZ"));                         
                listado.add(ven);
            }
            rs.close();
            st.close();
            
        } catch (Exception e) {
            System.out.println("Error en listarTodosD: " + e.getMessage());
        } finally {
            this.cerrar();
        }        
        return listado;        
    }
}
   

package Modelo;

import Vista.VCrearAlumnos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

public class AlumnoBD {

    VCrearAlumnos vp;
    PreparedStatement sentencia;

//    public static ArrayList<String> listanombres;
    public static Vector listanombres;

    public static void guardarAlumnoBD(Alumno alumno) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registro", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into alumno values('" + alumno.getCedula() + "','" + alumno.getNombre() + "','" + alumno.getApellido() + "','" + alumno.getDireccion() + "','" + alumno.getTeléfono() + "','" + alumno.getCarrera() + "','" + alumno.getModulo() + "','" + alumno.getCorreo() + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }

    }

     public void eliminar(Alumno Alumno) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root", "root");
            System.out.println("Concexion establecida");

            Statement sentencia = conexion.createStatement();

            int delete = sentencia.executeUpdate("delete from estudiantes where cedula=" + Alumno.getCedula());
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Eroor de coneccion" + ex);
        }
    }

    public static Alumno buscaralumno(String cedula) {
        Alumno alumno = new Alumno();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registro", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from alumno where cedula = " + cedula);
            while (necesario.next()) {

                String ced = necesario.getString("cedula");
                String nom = necesario.getString("nombres");
                String ape = necesario.getString("apellidos");
                String dir = necesario.getString("direccion");
                String tel = necesario.getString("telefono");
                String carr = necesario.getString("carrera");
                String mod = necesario.getString("modulo");
                String corr = necesario.getString("correo");
                alumno.setCedula(ced);
                alumno.setNombre(nom);
                alumno.setApellido(ape);
                alumno.setDireccion(dir);
                alumno.setTeléfono(tel);
                alumno.setCarrera(carr);
                alumno.setModulo(mod);
                alumno.setCorreo(corr);

            }
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
        return alumno;

    }

    public static Vector cargarnombres() {
        Alumno a;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registro", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select nombres,apellidos from alumno ");

//            listanombres = new ArrayList<>();
            listanombres = new Vector();
            while (necesario.next()) {

                String nom = necesario.getString("nombres");
                String ape = necesario.getString("apellidos");

                listanombres.add(nom + " " + ape);
//listanombres.set(0, nom + " " + ape);
            }
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
        return listanombres;
    }

    
    public void actualizar(Alumno Alumno) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registro", "root", "root");
            System.out.println("Concexion establecida");

            Statement sentencia = conexion.createStatement();

            int update = sentencia.executeUpdate ("update estudiantes set nombre='" + Alumno.getNombre() + "'," +
                                           "apellido='" + Alumno.getApellido()+"'," +"direccion='"+Alumno.getDireccion()+","+"telefono='"+Alumno.getTeléfono()+","+"carrera='"+Alumno.getCarrera()+","+"modulo='"+Alumno.getModulo()+","+"correo='" +Alumno.getCorreo()+"where cedula= "+ Alumno.getCedula());
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Eroor de coneccion" + ex);
        }
    }

    public static void main(String[] args) {
        System.out.println(cargarnombres());
    }

}

package daocontroller;

import conexion.Conexion;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {


    public static void createProductDAO(Employee employee) {

        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {
            PreparedStatement ps = null;

            try {


                String query = "INSERT INTO product(id_employee, name, last_name, phone, mail, passw, position)VALUES(?, ?, ?, ?, ?, ?, ?)";
                ps = connect.prepareStatement(query);


                ps.setInt(1, product.getId_Employee());

                ps.setString(2, product.getName());


                ps.setString(3, product.getLast_name());


                ps.setString(4, product.getPhone());


                ps.setString(5, product.getMail());


                ps.setString(6, product.getPassw());


                ps.setString(7, product.getPosition());
                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }


    } public static void selectProductDao(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs =   null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM product";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID" + rs.getInt("id_product"));
                System.out.println("Producto" + rs.getString("name"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void deleteProductoDao(int id_empleado) {
        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {

            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM product WHERE product.id_product = ?";

                ps = connect.prepareStatement(query);

                ps.setInt(1, id_product);

                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}

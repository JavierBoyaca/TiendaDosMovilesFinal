package daocontroller;

import conexion.Conexion;
import model.Costumer;
import model.Sale;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SaleDao {

    public static void createSaleDAO(Sale sale) {

        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {
            PreparedStatement ps = null;

            try {


                String query = "INSERT INTO sale(id_sale, product, costumer, employee, quantity, total_sale)VALUES(?, ?, ?, ?, ?, ?)";
                ps = connect.prepareStatement(query);


                ps.setInt(1, sale.getId_sale());

                ps.setInt(2, sale.getProduct());


                ps.setString(3, sale.getCostumer());


                ps.setString(4, sale.getEmployee());


                ps.setInt(5, sale.getQuantity());


                ps.setFloat(6, sale.getTotal_sale());


            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }


    } public static void selectSaleDao(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs =   null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM sale";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID" + rs.getInt("id_sale"));
                System.out.println("Cliente" + rs.getString("name"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void deleteSaleDao(int id_sale) {
        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {

            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM sale WHERE sale.id_sale = ?";

                ps = connect.prepareStatement(query);

                ps.setInt(1, id_sale);

                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}

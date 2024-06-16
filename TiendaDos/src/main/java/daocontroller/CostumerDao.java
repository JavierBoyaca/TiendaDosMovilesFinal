package daocontroller;

import conexion.Conexion;
import model.Costumer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CostumerDao {

    public static void createCostumerDAO(Costumer costumer) {

        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {
            PreparedStatement ps = null;

            try {


                String query = "INSERT INTO costumer(id_costumer, name, last_name, phone, mail, passw, type)VALUES(?, ?, ?, ?, ?, ?, ?)";
                ps = connect.prepareStatement(query);


                ps.setInt(1, costumer.getId_costumer());

                ps.setString(2, costumer.getName());


                ps.setString(3, costumer.getLast_name());


                ps.setString(4, costumer.getPhone());


                ps.setString(5, costumer.getMail());


                ps.setString(6, costumer.getPassw());


                ps.setString(7, costumer.getType());
                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }


    } public static void selectCostumerDao(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs =   null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM costumer";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID" + rs.getInt("id_costumer"));
                System.out.println("Cliente" + rs.getString("name"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void deleteCostumerDao(int id_costumer) {
        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {

            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM costumer WHERE costumer.id_costumer = ?";

                ps = connect.prepareStatement(query);

                ps.setInt(1, id_costumer);

                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}

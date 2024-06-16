package daocontroller;

import conexion.Conexion;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {
    public static void createEmployeeDAO(Employee employee) {

        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {
            PreparedStatement ps = null;

            try {


                String query = "INSERT INTO employee(id_employee, name, last_name, phone, mail, passw, position)VALUES(?, ?, ?, ?, ?, ?, ?)";
                ps = connect.prepareStatement(query);


                ps.setInt(1, employee.getId_Employee());

                ps.setString(2, employee.getName());


                ps.setString(3, employee.getLast_name());


                ps.setString(4, employee.getPhone());


                ps.setString(5, employee.getMail());


                ps.setString(6, employee.getPassw());


                ps.setString(7, employee.getPosition());
                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }


} public static void selectEmployeeDao(){

    Conexion conexion = new Conexion();

    PreparedStatement ps = null;

    ResultSet rs =   null;

    try(Connection connect = conexion.getConnectDB()){

        String query = "SELECT * FROM employee";

        ps = connect.prepareStatement(query);

        rs = ps.executeQuery();

        while (rs.next()){
            System.out.println("ID" + rs.getInt("id_employee"));
            System.out.println("Empleado" + rs.getString("name"));
        }

    }catch (SQLException e){
        System.out.println(e);
    }
}
public static void deleteEmployeeDao(int id_empleado) {
    Conexion conexion = new Conexion();

    try (Connection connect = conexion.getConnectDB()) {

        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM employee WHERE employee.id_empleado = ?";

            ps = connect.prepareStatement(query);

            ps.setInt(1, id_empleado);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    } catch (SQLException e) {
        System.out.println(e);
    }

    }

}



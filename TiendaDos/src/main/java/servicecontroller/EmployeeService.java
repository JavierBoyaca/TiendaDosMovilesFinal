package servicecontroller;

import daocontroller.EmployeeDao;
import model.Employee;

import java.util.Scanner;

public class EmployeeService {

    Scanner sc = new Scanner(System.in);
    public void createEmployee(Employee employee){


        System.out.println("Ingrese el id del empleado");
        int id_empleado = sc.nextInt();
        employee.setId_Employee(id_empleado);
        sc.nextLine();

        System.out.println("Ingrese el nombre del empleado");
        String name = sc.nextLine();
        employee.setName(name);

        System.out.println("Ingrese el apellido del empleado");
        String last_name = sc.nextLine();
        employee.setLast_name(last_name);

        System.out.println("Ingrese el telefono del empleado");
        String phone = sc.nextLine();
        employee.setPhone(phone);

        System.out.println("Ingrese el mail del empleado");
        String mail = sc.nextLine();
        employee.setMail(mail);

        System.out.println("Ingrese el password del empleado");
        String passw = sc.nextLine();
        employee.setPassw(passw);

        System.out.println("Ingrese el cargo del empleado");
        String position = sc.nextLine();
        employee.setPosition(position);

        EmployeeDao.createEmployeeDAO(employee);

    }

    public void selectEmployee(){
        EmployeeDao.selectEmployeeDao();

    }
    public void deleteEmployee(int idEmpleado){

        System.out.println("Indique el id del empleado a eliminar");
        int idEmployee = sc.nextInt();

        EmployeeDao.deleteEmployeeDao(idEmpleado);

    }
}
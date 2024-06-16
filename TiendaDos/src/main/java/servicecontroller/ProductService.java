package servicecontroller;

import daocontroller.EmployeeDao;
import model.Employee;
import model.Product;

import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);
    public void createEmployee(Product product){


        System.out.println("Ingrese el id del empleado");
        int id_empleado = sc.nextInt();
        product.setId_Employee(id_empleado);
        sc.nextLine();

        System.out.println("Ingrese el nombre del empleado");
        String name = sc.nextLine();
        product.setName(name);

        System.out.println("Ingrese el apellido del empleado");
        String last_name = sc.nextLine();
        product.setLast_name(last_name);

        System.out.println("Ingrese el telefono del empleado");
        String phone = sc.nextLine();
        product.setPhone(phone);

        System.out.println("Ingrese el mail del empleado");
        String mail = sc.nextLine();
        product.setMail(mail);

        System.out.println("Ingrese el password del empleado");
        String passw = sc.nextLine();
        product.setPassw(passw);

        System.out.println("Ingrese el cargo del empleado");
        String position = sc.nextLine();
        product.setPosition(position);

        Product.createProductDAO(product);

    }

    public void selectProduct(){
        ProductDao.selectProductDao();

    }
    public void deleteProduct(int idProduct){

        System.out.println("Indique el id del empleado a eliminar");
        int idProduct = sc.nextInt();

        ProductDao.deleteProductDao(idProduct);

    }
}

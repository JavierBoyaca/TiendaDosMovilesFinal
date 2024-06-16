package servicecontroller;

import daocontroller.CostumerDao;
import model.Costumer;

import java.util.Scanner;

public class CostumerService {
    Scanner sc = new Scanner(System.in);
    public void createCostumer(Costumer costumer){


        System.out.println("Ingrese el id del cliente");
        int id_costumer = sc.nextInt();
        costumer.setId_costumer(id_costumer);
        sc.nextLine();

        System.out.println("Ingrese el nombre del cliente");
        String name = sc.nextLine();
        costumer.setName(name);

        System.out.println("Ingrese el apellido del cliente");
        String last_name = sc.nextLine();
        costumer.setLast_name(last_name);

        System.out.println("Ingrese el telefono del cliente");
        String phone = sc.nextLine();
        costumer.setPhone(phone);

        System.out.println("Ingrese el mail del cliente");
        String mail = sc.nextLine();
        costumer.setMail(mail);

        System.out.println("Ingrese el password del cliente");
        String passw = sc.nextLine();
        costumer.setPassw(passw);

        System.out.println("Especifique el tipo de cliente");
        String type = sc.nextLine();
        costumer.setType(type);

        CostumerDao.createCostumerDAO(costumer);

    }

    public void selectCostumer(){
        CostumerDao.selectCostumerDao();

    }
    public void deleteCostumer(int idCostumer){

        System.out.println("Indique el id del cliente a eliminar");
        int id_Costumer = sc.nextInt();

        CostumerDao.deleteCostumerDao(idCostumer);

    }
}

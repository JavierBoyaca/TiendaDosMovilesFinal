package servicecontroller;

import model.Category;
import model.Costumer;
import model.Employee;
import model.Sale;

public class ServiceTest {

    public static void main(String[] args) {

        Category category = new Category();
        CategoryService cs = new CategoryService();


        cs.createCategory(category);
        cs.selectCategory();
        System.out.println("Ingrese el Id de la categoria a eliminar");
        int id = 2;
        cs.deleteCategory(id);

        Employee employee = new Employee();
        EmployeeService es = new EmployeeService();

        es.createEmployee(employee);

        Costumer costumer = new Costumer();
        CostumerService csr = new CostumerService();

        csr.createCostumer(costumer);

        Sale sale = new Sale();
        SaleService ss = new SaleService();

        ss.createSale(sale);

    }
}

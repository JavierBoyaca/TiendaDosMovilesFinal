package model;

import java.time.LocalDate;

public class Sale {

    private int id_sale;
    private int product;

    private  int quantity;
    private String employee;
    private String costumer;
    private float total_sale;
    LocalDate fechaActual = LocalDate.now();

    public Sale(){

    }

    public Sale(int id_sale, int product, int quantity, String employee, String costumer, float total_sale, LocalDate fechaActual) {
        this.id_sale = id_sale;
        this.product = product;
        this.quantity = quantity;
        this.employee = employee;
        this.costumer = costumer;
        this.total_sale = total_sale;
        this.fechaActual = fechaActual;
    }

    public int getId_sale() {
        return id_sale;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public float getTotal_sale() {
        return total_sale;
    }

    public void setTotal_sale(float total_sale) {
        this.total_sale = total_sale;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }
}

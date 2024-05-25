/*
 Esta clase sirve para manejar las peticiones GET a las rutas "/api/customers" y retornar los datos de los clientes en formato JSON.
 Es decir, esta clase se encarga de manejar las peticiones HTTP relacionadas con los clientes de la floristería.
Por ejemplo, se encarga de recuperar todos los clientes, recuperar un cliente por su id, guardar un cliente, eliminar un cliente, etc.
    
 */


package com.example.floristeriaiud00.dto;

public class CustomerDTO {
    private Long id;
    private String name;
    private String address;
    private String contactInfo;

    public CustomerDTO() {
    }

    public CustomerDTO(Long id, String name, String address, String contactInfo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

package com.example.implementations;

import com.example.interfaces.CocheCRUD;

public class CocheCRUDImp implements CocheCRUD {
    @Override
    public void save(String coche) {
        System.out.println("Se guardo el elemento: " + coche);
    }

    @Override
    public void delete(String coche) {
        System.out.println("Se elimino el elemento: " + coche);
    }

    @Override
    public String findAll() {
        return "Mostrando todos los elementos";
    }
}

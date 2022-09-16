package com.example;

import com.example.implementations.CocheCRUDImp;
import com.example.interfaces.CocheCRUD;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImp();

        cocheCrud.save("ford ka");
        cocheCrud.delete("El camino");
        System.out.println(cocheCrud.findAll());
    }
}

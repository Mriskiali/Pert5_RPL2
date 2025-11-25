/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_50422921_4ia16;

import com.mycompany.pert5_50422921_4ia16.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author muafa
 */
@SpringBootApplication
public class Pertemuan5SpringBootApplication implements CommandLineRunner{
    
    @Autowired
    private MahasiswaController mhsController;
    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5SpringBootApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        mhsController.tampilkanMenu();
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Modelo.*;

/**
 *
 * @author PC
 */
public class Prueba {

    public static void main(String[] args) {
        Negocio obj = new Negocio();
        for (Cliente1 a :obj.LisCli(0)) {
            System.out.println();
        }
    }
}

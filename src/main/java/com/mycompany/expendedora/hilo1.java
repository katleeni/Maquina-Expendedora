/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expendedora;

import java.lang.Thread;
import java.util.concurrent.ThreadLocalRandom;
import com.mycompany.expendedora.MaquinaExpendedora;

/**
 *
 * @author juand
 */
public class hilo1 extends Thread {
    
        String nombre;
	int numero;
	String categoria;
	int velocidad;
	String estado = "sano";
    
    
    public hilo1(String nombre, int numero, String categoria) {
		this.nombre = nombre;
		this.numero = numero;
		this.categoria = categoria;
	}
    
    
    
    
}

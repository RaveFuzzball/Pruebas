/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import practica_3.*;
public class Sistema1 {
    public static void main(String [] args) throws Exception{
        String respuesta = null;
        Scanner opcion = new Scanner(System.in);
        System.out.println("Desea imprimir un boleto (si/no): ");
        respuesta = opcion.next();
        while(respuesta.toUpperCase().equals("SI")){
            System.out.println("Vuelo Nacional o Internacional: ");
            respuesta = opcion.next();
            switch(respuesta.toUpperCase()){
                case "NACIONAL":
                    System.out.println("Que clase desea comprar: ");
                    respuesta = opcion.next();
                    BoletoNacional b1;
                    switch(respuesta.toUpperCase()){
                        case "TURISTA":
                            b1 = Sistema1.crearBoletoNacional(EnumClase.TURISTA);
                            PasajeroTurista p1 = new PasajeroTurista(b1);
                            System.out.println("Desea documentar una maleta: ");
                            respuesta = opcion.next();
                             if (respuesta.toUpperCase().equals("SI") == true){
                                System.out.println("Peso de la maleta: ");
                                double peso = opcion.nextDouble();
                                Maleta m1 = new Maleta(peso);
                                p1.documentarMaleta(m1);
                                System.out.println(p1.getMaleta().obtenerTotal());
                            }
                            break;
                        case "PRIMERA CLASE":
                            b1 = Sistema1.crearBoletoNacional(EnumClase.PRIMERA_CLASE);
                            PasajeroPrimeraClase p2 = new PasajeroPrimeraClase(b1);
                            System.out.println("Desea documentar una maleta: ");
                            respuesta = opcion.next();
                            Sistema1.guardarMaletas((PasajeroPrimeraClase)p2);
                            break;
                        case "EJECUTIVA":
                            b1 = Sistema1.crearBoletoNacional(EnumClase.EJECUTIVO);
                            PasajeroEjecutivo p3 = new PasajeroEjecutivo(b1);
                            Sistema1.guardarMaletas((PasajeroEjecutivo)p3);
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                    }
                    break;
                case "INTERNACIONAL":
                    break;
                default:
                    System.out.println("Respuesta invalida");
            }
            System.out.println("Desea imprimir un boleto (si/no): ");
            respuesta = opcion.next();
        }  
    }
    public static BoletoNacional crearBoletoNacional(EnumClase clase){
        String respuesta = null;
        Scanner opcion = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombrePasajero = opcion.next();
        System.out.println("Ingrese edad: ");
        int edadPasajero = opcion.nextInt();
        System.out.println("Ingrese genero: ");
        String generoPasajero = opcion.next();
        System.out.println("Ingrese numero de asiento: ");
        int numAsiento = opcion.nextInt();
        System.out.println("Ingrese numero de vuelo: ");
        int numVuelo = opcion.nextInt();
        System.out.println("Ingrese aerolinea: ");
        String aerolinea = opcion.next();
        System.out.println("Ingrese destino");
        String destino = opcion.next();
        System.out.println("Ingrese curp: ");
        String curp = opcion.next();
        BoletoNacional b1 = new BoletoNacional(nombrePasajero,edadPasajero,generoPasajero,clase,numAsiento,numVuelo,aerolinea,destino,curp);
         return b1;
    }
    public static void guardarMaletas(Pasajero p1) throws Exception{
        Scanner opcion = new Scanner(System.in);
        String respuesta;
        System.out.println("Desea documentar una maleta: ");
        respuesta = opcion.next();
        if (respuesta.toUpperCase().equals("SI") == true){
            System.out.println("Peso de la maleta: ");
            double peso = opcion.nextDouble();
            Maleta m1 = new Maleta(peso);
            p1.documentarMaleta(m1);
        }
    }
}

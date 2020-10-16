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
        String respuesta;
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
                            Sistema1.guardarMaletas((PasajeroTurista)p1);
                            System.out.println(p1.getBoleto());
                            System.out.println("Costo extra por maleta: " + p1.getMaleta().obtenerTotal());
                            break;
                        case "PRIMERA CLASE":
                            b1 = Sistema1.crearBoletoNacional(EnumClase.PRIMERA_CLASE);
                            PasajeroPrimeraClase p2 = new PasajeroPrimeraClase(b1);
                            Sistema1.guardarMaletas((PasajeroPrimeraClase)p2);
                            Maleta[] maletas = new Maleta[3];
                            maletas = p2.getMaletas();
                            System.out.println(p2.getBoleto().mostrar());
                            if(p2.getNumMaletasDocumentadas() == 1)
                                System.out.println("Costo extra de la maleta: " + maletas[0].obtenerTotal());
                            if(p2.getNumMaletasDocumentadas() == 2){
                                System.out.println("Costo extra maleta 1: " + maletas[0].obtenerTotal());
                                System.out.println("Costo extra maleta 2: " + maletas[1].obtenerTotal());
                            }
                            break;
                        case "EJECUTIVA":
                            b1 = Sistema1.crearBoletoNacional(EnumClase.EJECUTIVO);
                            PasajeroEjecutivo p3 = new PasajeroEjecutivo(b1);
                            Sistema1.guardarMaletas((PasajeroEjecutivo)p3);
                            Maleta[] maletas1 = new Maleta[2];
                            maletas1 = p3.getMaletas();
                            System.out.println(p3.getBoleto().mostrar());
                            if(p3.getNumMaletasDocumentadas() == 1)
                                System.out.println(maletas1[0].obtenerTotal());
                            if(p3.getNumMaletasDocumentadas() == 2){
                                System.out.println("Costo extra maleta 1: " + maletas1[0].obtenerTotal());
                                System.out.println("Costo extra maleta 2: " + maletas1[1].obtenerTotal());
                            }
                            if(p3.getNumMaletasDocumentadas() == 3){
                                System.out.println("Costo extra maleta 1: " + maletas1[0].obtenerTotal());
                                System.out.println("Costo extra maleta 2: " + maletas1[1].obtenerTotal());
                                System.out.println("Costo extra maleta 3: " + maletas1[2].obtenerTotal());
                            }
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                    }
                    break;
                case "INTERNACIONAL":
                    System.out.println("Que clase desea comprar: ");
                    respuesta = opcion.next();
                    BoletoInternacional b2;
                    switch(respuesta.toUpperCase()){
                        case "TURISTA":
                            b2 = Sistema1.crearBoletoInternacional(EnumClase.TURISTA);
                            PasajeroTurista p1 = new PasajeroTurista(b2);
                            Sistema1.guardarMaletas((PasajeroTurista)p1);
                            System.out.println(p1.getBoleto());
                            System.out.println("Costo extra por maleta: " + p1.getMaleta().obtenerTotal());
                            break;
                        case "PRIMERA CLASE":
                            b2 = Sistema1.crearBoletoInternacional(EnumClase.PRIMERA_CLASE);
                            PasajeroPrimeraClase p2 = new PasajeroPrimeraClase(b2);
                            Sistema1.guardarMaletas((PasajeroPrimeraClase)p2);
                            Maleta[] maletas = new Maleta[3];
                            maletas = p2.getMaletas();
                            System.out.println(p2.getBoleto().mostrar());
                            if(p2.getNumMaletasDocumentadas() == 1)
                                System.out.println("Costo extra de la maleta: " + maletas[0].obtenerTotal());
                            if(p2.getNumMaletasDocumentadas() == 2){
                                System.out.println("Costo extra maleta 1: " + maletas[0].obtenerTotal());
                                System.out.println("Costo extra maleta 2: " + maletas[1].obtenerTotal());
                            }
                            break;
                        case "EJECUTIVA":
                            b2 = Sistema1.crearBoletoInternacional(EnumClase.EJECUTIVO);
                            PasajeroEjecutivo p3 = new PasajeroEjecutivo(b2);
                            Sistema1.guardarMaletas((PasajeroEjecutivo)p3);
                            Maleta[] maletas1 = new Maleta[2];
                            maletas1 = p3.getMaletas();
                            System.out.println(p3.getBoleto().mostrar());
                            if(p3.getNumMaletasDocumentadas() == 1)
                                System.out.println(maletas1[0].obtenerTotal());
                            if(p3.getNumMaletasDocumentadas() == 2){
                                System.out.println("Costo extra maleta 1: " + maletas1[0].obtenerTotal());
                                System.out.println("Costo extra maleta 2: " + maletas1[1].obtenerTotal());
                            }
                            if(p3.getNumMaletasDocumentadas() == 3){
                                System.out.println("Costo extra maleta 1: " + maletas1[0].obtenerTotal());
                                System.out.println("Costo extra maleta 2: " + maletas1[1].obtenerTotal());
                                System.out.println("Costo extra maleta 3: " + maletas1[2].obtenerTotal());
                            }
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                    }
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
    public static BoletoInternacional crearBoletoInternacional(EnumClase clase){
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
        System.out.println("Ingrese numero de pasaporte ");
        int numeroPasaporte = opcion.nextInt();
        System.out.println("Ingrese tipo de visa: ");
        String tipoVisa = opcion.next();
        EnumVisa visa;
        visa = EnumVisa.valueOf(tipoVisa.toUpperCase());
        System.out.println("Ingrese Años de vigencia de la visa: ");
        int vigencia = opcion.nextInt();
        BoletoInternacional b1 = new BoletoInternacional (nombrePasajero,edadPasajero,generoPasajero,clase,numAsiento,numVuelo,aerolinea,destino,numeroPasaporte,visa,vigencia);
         return b1;
    }
    public static void guardarMaletas(Pasajero p1) throws Exception{
        Scanner opcion = new Scanner(System.in);
        String respuesta;
        System.out.println("Desea documentar una maleta: ");
        respuesta = opcion.next();
        while(respuesta.toUpperCase().equals("SI") == true){
            
            System.out.println("Peso de la maleta: ");
            double peso = opcion.nextDouble();
            Maleta m1 = new Maleta(peso);
            p1.documentarMaleta(m1);
            System.out.println("Desea documentar otra una maleta: ");
            respuesta = opcion.next();
        }
    }
}

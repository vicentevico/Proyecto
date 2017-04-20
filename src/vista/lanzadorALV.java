/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Alumne_Controller;
import modelo.Alumne;

/**
 *
 * @author ALUMNEDAM
 */
public class lanzadorALV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            Alumne_Controller ac = new Alumne_Controller();
            
            Alumne al1 = new Alumne();
            al1.setNif("53654704A");
            al1.setNom("Aitor");
            al1.setCognom("Led");
            al1.setCorreu("asa@te.asa");
            al1.setTelefon(433434344);
            
            ac.afegir(al1);
            
            
            // Creamos un objeto cliente y vehiculo para añadir la poliza 
//            Client c = cc.BuscarPerNom("Vicente");
//            Vehicle v = vc.BuscarPerMatricula("4356ASW");

            // Crea un usuari
//            Usuari usu1 = new Usuari();
//            usu1.setNom("chachi");
//            usu1.setContrasenya("pirulino");
//
//            // Crea una nou client          
//            Client client1 = new Client();
//            client1.setNomClient("Vicente");
//            client1.setNif("33456787B");
//            
//            Adreca adreca1 = new Adreca();
//            adreca1.setCarrer("pachacho");
//            adreca1.setNumero(10);
//            adreca1.setPoblicacio("BCN");
//            
//            client1.setAdreca(adreca1);
            
            
            //Crea un nou vehicle
//            Vehicle vehicle1 = new Vehicle();
////            vehicle1.setPropietari(c);
//            
//            vehicle1.setMarca("Seat");
//            vehicle1.setMatricula("4356ASW");
//            vehicle1.setAnyFabricacio(2012);
            
            //Crea una nova polissa
//            Polissa polissa1 = new Polissa();
//            polissa1.setNumeroPolissa("1");
//            polissa1.setTipus(true);
//            polissa1.setPrima(500);
//            polissa1.setPrenedor(c);
//            polissa1.setVehicle(v);
//            Calendar dataInici = new GregorianCalendar(2016,1,1);
//            polissa1.setDataInici(dataInici);
//            Calendar dataFi = new GregorianCalendar(2018,12,31);
//            polissa1.setDataFi(dataFi);

            //Crea una nova asseguradora
//            Asseguradora asseg1 = new Asseguradora();
//            asseg1.setNomAsseguradora("Asseguradoras Castillo");
//            asseg1.setNifAsseguradora("1234567890");
            
              
            
            // ______________Insertamos y consulltamos las tablas________________________
            
            //CLIENTES
//            cc.Insertar(client1);
//            cc.Consulta();
//            cc.Eliminar(cc.BuscarPerNom("Vicente"));

            //VEHICULOS
//            vc.Insertar(vehicle1);
//            vc.Consulta();
//            System.out.println(vc.BuscarPerMatricula("4356ASW"));
//            vc.Eliminar(vc.BuscarPerMatricula("4356ASW"));
            
            //POLIZAS
//            pc.Insertar(polissa1);
//            pc.Consulta();
//            Polissa modPol = pc.BuscarPorId(1421L);
//            modPol.setNumeroPolissa("87");
//            pc.Modificar(modPol);
//            pc.Eliminar(pc.BuscarPerClient("Vicente"));

            //USUARIOS
//            uc.Insertar(usu1);
//            uc.Consulta();
//            System.out.println(uc.validarUsuari("chachi", "pirulino"));
//            uc.Eliminar(uc.bucarUsuariPerNom("chachi"));

            //ASEGURADORAS
//            ac.Insertar(asseg1);
//            ac.Consulta();
//            ac.Eliminar(ac.BuscarPorNombre("Asseguradoras Castillo"));

            System.out.println("FI");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

package com.edu.uce.negocio;

public class NotificacionSMS {

     public void enviar(String numero, String mensaje) {
        System.out.println("Se envia SMS al numero: " + numero +
                           "\nCon el mensaje: " + mensaje);
    } 
}

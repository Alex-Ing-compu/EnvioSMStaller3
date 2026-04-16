package com.edu.uce.negocio;

public class NotificadorWasa {

    private String enviarMensaje;

     public void enviar(String numero, String mensaje) {
        System.out.println("Se envia notificacion wasap al numero: " + numero +
                           "\nCon el mensaje: " + mensaje);
    } 
}



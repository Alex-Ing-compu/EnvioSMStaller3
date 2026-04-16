package com.edu.uce.negocio;

public class PedidoService {
    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido...");
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        
        NotificadorMail n1 = new NotificadorMail();
        n1.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");


        // enviar por maail si el total es mayor a 100
        
        if (pedido.getTotal() > 120) {
            NotificadorMail mail = new NotificadorMail();
            mail.enviar(pedido.getCorreo(), 
                "su pedido supera los 100 USD");
        } 


        // enviar por sms si es menor o igual a 100
        else {
            NotificacionSMS sms = new NotificacionSMS();
            sms.enviar(pedido.getTelefono(), 
                "su pedido es menor o igual a 100 USD");
        }


        if(pedido.getTotal()< 50){
            NotificadorWasa wasa1 = new NotificadorWasa();
            wasa1.enviar(pedido.getCorreo(), "Enviando notificacion por wasap");
        }

    }
}


import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* 
        Pedido p1 = new Pedido("Joseph", "CocaCola", 1200.0, "joseph@example.com");
        PedidoService service = new PedidoService();
        service.registrar(p1);
        */

        Pedido p1 = new Pedido(
            "Alex",
            "CocaCola",
            3000,
            "alex@example.com",
            "0999999999"
        );

        Pedido p2 = new Pedido(
            "Alex",
            "CocaCola",
            5,
            "alex@example.com",
            "0999999999"
        );

        Pedido p3 = new Pedido(
            
            "Alex",
            "CocaCola",
            15,
            "alex@example.com",
            "0999999999"

        );


       
        PedidoService service = new PedidoService();
        service.registrar(p1);

        service.registrar(p2);

        service.registrar(p3);

        //PedidoService service2 = new PedidoService();
        //service2.registrar(p3);

 
        
    }
}

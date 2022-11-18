import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerWs {
    public static void main(String[] args){
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("server deployed at https://0.0.0.0:7878/ ");



    }
}

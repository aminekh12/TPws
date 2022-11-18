import jakarta.xml.ws.Endpoint;

public class ServerWs {
    public static void main(String[] args){
        Endpoint.publish("https://0.0.0.0:7878/",new BanqueService());



    }
}

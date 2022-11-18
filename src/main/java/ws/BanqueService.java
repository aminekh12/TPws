package ws;

import classes.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "Banquews")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam double mt){

        return mt*1000;
    }
    @WebMethod(operationName = "getcompte")
    public Compte getCompte(@WebParam int code){

        return  new Compte(code,Math.random()+9888,new Date());
    }
    @WebMethod(operationName = "liste")
    public List<Compte> listComptes(){
        return List.of(new Compte(1,Math.random()+9888,new Date()),
                new Compte(2,Math.random()+9888,new Date()),
                new Compte(3,Math.random()+9888,new Date()));

    }

}

package webservicexml.exerc2;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService (name = "Big", serviceName = "Big")
public class MyBigWS {
    @WebMethod
    public int sum(int a, int b){
        return a + b;
    }
    
}

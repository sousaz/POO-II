package chainOfResponsibilityExample.middleware;

public class BrazilianMiddleware extends Middleware{

    @Override
    public boolean check(String email, String password) {
        if(email.endsWith(".br"))
            return false;
        return checkNext(email, password);
    }

}

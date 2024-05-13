package atividadeCOR;

import atividadeCOR.middleware.Middleware;

public class Server {
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean checkLoan(User user, float loan){
        if(middleware.check(user, loan)){
            System.out.println("Congratulations " + user.getNome() + " you can get a loan!!");
            return true;
        }
        System.out.println("foda :(");
        return false;
    }
}

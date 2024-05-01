package atividadeCOR.middleware;

import atividadeCOR.User;

public class DisponibilityMiddleware extends Middleware{
    public boolean check(User user, float loan){
        if(loan > 100_000)
            return false;
        return checkNext(user, loan);
    }

}

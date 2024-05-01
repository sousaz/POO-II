package atividadeCOR.middleware;

import atividadeCOR.User;

public class CompatibilityMiddleware extends Middleware{
    public boolean check(User user, float loan){
        if((user.getCredit() * 0.25) < loan/12)
            return false;
        return checkNext(user, loan);
    }
}

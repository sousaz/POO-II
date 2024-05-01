package atividadeCOR.middleware;

import atividadeCOR.User;

public class CreditHistoryMiddleware extends Middleware{
    public boolean check(User user, float loan){
        if(user.isRestriction())
            return false;
        return checkNext(user, loan);
    }
}

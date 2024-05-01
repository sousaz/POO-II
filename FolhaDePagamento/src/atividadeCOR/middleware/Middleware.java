package atividadeCOR.middleware;

import atividadeCOR.User;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain){
        Middleware head = first;
        for(Middleware nextChain: chain){
            head.next = nextChain;
            head = nextChain;
        }
        return first;
    }

    public abstract boolean check(User user, float loan);

    protected boolean checkNext(User user, float loan){
        if(next == null)
            return true;
        return next.check(user, loan);
    }
}

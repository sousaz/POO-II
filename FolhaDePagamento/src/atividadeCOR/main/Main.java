package atividadeCOR.main;

import atividadeCOR.Server;
import atividadeCOR.User;
import atividadeCOR.middleware.CompatibilityMiddleware;
import atividadeCOR.middleware.CreditHistoryMiddleware;
import atividadeCOR.middleware.DisponibilityMiddleware;
import atividadeCOR.middleware.Middleware;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("joclivis", 5000, false);
        User user2 = new User("joclivis", 2000, true);
        Server server = new Server();
        final float loan = 10000;

        Middleware middleware = Middleware.link(
                new DisponibilityMiddleware(),
                new CompatibilityMiddleware(),
                new CreditHistoryMiddleware()
        );
        server.setMiddleware(middleware);
        server.checkLoan(user2, loan);
    }
}

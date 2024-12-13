package listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import org.flywaydb.core.Flyway;
import repository.DbWork;

@WebListener
public class AppContextListener implements ServletContextListener{

    public void contextInitialized(ServletContextEvent sce) {
        DbWork.getInstance();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        DbWork.getInstance().destroy();
    }
}

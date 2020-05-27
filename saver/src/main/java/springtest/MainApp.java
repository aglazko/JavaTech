package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import springtest.savers.Saver;
import springtest.services.SongSaverService;

import java.util.ArrayList;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
        SongSaverService saverService = context.getBean(SongSaverService.class);
        Map<String, Saver> savers = context.getBeansOfType(Saver.class);
        saverService.savers = new ArrayList<>(savers.values());
        Song song = new Song("Best heats", 1300);
        saverService.save(song);
    }
}

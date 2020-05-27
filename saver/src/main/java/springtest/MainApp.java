package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import springtest.services.SongSaverService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
        SongSaverService saverService = context.getBean(SongSaverService.class);
        Song song = new Song("Best heats", 1300);
        saverService.save(song);
    }
}

package springtest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springtest.savers.Saver;
import springtest.Song;

import java.util.List;

@Component
public class SongSaverService {
    @Autowired
    public List<Saver> savers;

    public void save(Song song){
        for (Saver saver: savers) {
            saver.save(song);
        }
    }
}
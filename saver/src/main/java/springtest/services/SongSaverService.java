package springtest.services;

import org.springframework.beans.factory.annotation.Autowired;
import springtest.savers.Saver;
import springtest.Song;

import java.util.List;

public class SongSaverService {
    @Autowired
    public List<Saver> savers;

    public void save(Song song){
        for (Saver saver: savers) {
            saver.save(song);
        }
    }
}
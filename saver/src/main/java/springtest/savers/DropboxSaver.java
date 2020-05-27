package springtest.savers;

import org.springframework.stereotype.Component;
import springtest.Song;

@Component
class DropboxSaver implements Saver {
    @Override
    public void save(Song song) {
        System.out.println(song.name + "Saved to Dropbox");
    }
}
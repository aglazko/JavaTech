import config.HibernateUtil;
import models.Artist;
import models.Label;
import models.Song;
import models.Text;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SongService songService = new SongService();
        Integer id = songService.insertSong(
                "All is fine",
                new Text("My darling", 100L),
                new Label("Green Records"),
                new ArrayList<Artist>()
                        {{
                            add(new Artist("MC Pole"));
                            add(new Artist("Kevin Roke"));
                        }});
        Song song = songService.getSong(id);
        System.out.println(song.toString());
        Integer new_id = songService.updateSong(id, "For everyone", null, null, null);
        System.out.println(id.equals(new_id));
        System.out.println(songService.getSongs());
        songService.deleteSong(id);
        System.out.println(songService.getSongs());
    }
}

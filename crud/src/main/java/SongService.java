import config.HibernateUtil;
import models.Artist;
import models.Label;
import models.Song;
import models.Text;
import org.hibernate.Session;

import java.util.List;

public class SongService {
    public Integer insertSong(String name, Text text, Label label, List<Artist> artists){
        Song song = new Song(name, text, label, artists);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Integer id = (Integer) session.save(song);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    public Integer insertLabel(String name){
        Label label = new Label(name);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Integer id = (Integer) session.save(label);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    public Integer insertArtist(String name){
        Artist artist = new Artist(name);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Integer id = (Integer) session.save(artist);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    public Integer insertText(String text, Long textSize){
        Text _text = new Text(text, textSize);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Integer id = (Integer) session.save(_text);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    public Song getSong(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Song song = (Song) session.get(Song.class, id);
        session.close();
        return song;
    }
    public Artist getArtist(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Artist artist = (Artist) session.get(Artist.class, id);
        session.close();
        return artist;
    }
    public Text getText(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Text text = (Text) session.get(Text.class, id);
        session.close();
        return text;
    }

    public Label getLabel(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Label label = (Label) session.get(Label.class, id);
        session.close();
        return label;
    }

    public List<Song> getSongs(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Song> songs = session.createCriteria(Song.class).list();
        session.close();
        return songs;
    }

    public List<Artist> getArtists(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Artist> artists = session.createCriteria(Artist.class).list();
        session.close();
        return artists;
    }

    public Integer updateSong(Integer id, String songName, Text text, Label label, List<Artist> artists){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Song song = (Song) session.get(Song.class, id);
        if (songName != null) {
            song.setSongName(songName);
        }
        if (text != null) {
            song.setText(text);
        }
        if (label != null) {
            song.setLabel(label);
        }
        if (artists != null) {
            song.setArtists(artists);
        }
        Integer new_id = (Integer) session.save(song);
        session.getTransaction().commit();
        session.close();
        return new_id;
    }

    public void deleteSong(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Song song = (Song) session.get(Song.class, id);
        session.delete(song);
        session.getTransaction().commit();
        session.close();
    }
}

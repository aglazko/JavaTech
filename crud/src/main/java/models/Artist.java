package models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Artist{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "artist_name")
    String artistName;

    @ManyToMany(mappedBy = "artists", fetch = FetchType.EAGER)
    List<Song> songs;

    public Artist() {
    }

    public Artist(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}

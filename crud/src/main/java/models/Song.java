package models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Song{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "song_name")
    String songName;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Text text;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "label_id")
    Label label;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "SongArtist",
            joinColumns = {@JoinColumn(name = "song_id")},
            inverseJoinColumns = {@JoinColumn(name = "artist_id")}
    )
    List<Artist> artists;

    public Song(){

    }

    public Song(String songName, Text text, Label label, List<Artist> artists){
        this.songName = songName;
        this.text = text;
        this.label = label;
        this.artists = artists;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", text=" + text +
                ", label=" + label +
                ", artists=" + artists +
                '}';
    }
}

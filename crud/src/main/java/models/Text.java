package models;

import javax.persistence.*;

@Entity
public class Text{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "text_text")
    String text;

    @Column(name = "text_size")
    Long textSize;

    public Text() {
    }

    public Text(String text, Long textSize) {
        this.text = text;
        this.textSize = textSize;
    }

    @Override
    public String toString() {
        return "Text{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", textSize=" + textSize +
                '}';
    }
}

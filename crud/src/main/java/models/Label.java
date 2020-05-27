package models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Label{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "label_name")
    String labelName;

    @OneToMany(mappedBy = "label", fetch = FetchType.EAGER)
    List<Song> songs;

    public Label() {
    }

    public Label(String labelName) {
        this.labelName = labelName;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", labelName='" + labelName + '\'' +
                '}';
    }
}

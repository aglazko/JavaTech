package springtest.savers;

import springtest.Song;


class DBSaver implements Saver {
    @Override
    public void save(Song song) {
        System.out.println(song.name + "Saved to database");
    }
}

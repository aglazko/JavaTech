package springtest.savers;

import springtest.Song;

class DropboxSaver implements Saver {
    @Override
    public void save(Song song) {
        System.out.println(song.name + "Saved to Dropbox");
    }
}
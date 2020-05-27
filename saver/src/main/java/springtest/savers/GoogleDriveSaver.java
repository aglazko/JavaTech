package springtest.savers;

import springtest.Song;

class GoogleDriveSaver implements Saver {
    @Override
    public void save(Song song) {
        System.out.println(song.name + "Saved to Google Drive");
    }
}

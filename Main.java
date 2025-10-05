import java.util.ArrayList;
import java.util.Objects;

class Song {
    private String songName;

    Song(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(this.songName, song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songName);
    }
    
    @Override
    public String toString() {
       return songName;
    }
}

class Subscriber {
    private String userId;
    private ArrayList<Song> userPlaylist = new ArrayList<>();

    Subscriber(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public ArrayList<Song> getUserPlaylist() {
        return userPlaylist;
    }

    void downloadSong(SongPlaylist playlist, Song s) {
        if (!playlist.containsSong(s)) {
            System.out.println(s.getSongName() + " is not available");
        } else if (userPlaylist.contains(s)) {
            System.out.println(s.getSongName() + " already downloaded");
        } else {
            userPlaylist.add(s);
            System.out.println(s.getSongName() + " downloaded");
        }
    }

    void deleteSong(Song s) {
        if (userPlaylist.remove(s)) {
            System.out.println(s.getSongName() + " deleted");
        } else {
            System.out.println(s.getSongName() + " not found in your downloads");
        }
    }

    void displayUserPlaylist() {
        if (userPlaylist.isEmpty()) {
            System.out.println("No songs available");
        } else {
            System.out.println(userId + " possesses songs:");
            for (Song s : userPlaylist) {
                System.out.println("- " + s.getSongName());
            }
        }
    }
}

class SongPlaylist {
    private ArrayList<Song> allSongs = new ArrayList<>();

    public ArrayList<Song> getAllSongs() {
        return allSongs;
    }

    void addSong(Song s) {
        if (!allSongs.contains(s)) {
            allSongs.add(s);
        } else {
            System.out.println("Song already present in the playlist");
        }
    }

    void removeSong(Song s) {
        if (allSongs.remove(s)) {
            System.out.println(s.getSongName() + " removed from playlist");
        } else {
            System.out.println(s.getSongName() + " not available");
        }
    }

    void showAvailableSongs() {
        System.out.println("Available songs in the playlist:");
        for (Song s : allSongs) {
            System.out.println("- " + s.getSongName());
        }
    }

    boolean containsSong(Song s) {
        return allSongs.contains(s);
    }
}

class Main {
    public static void main(String[] args) {
        SongPlaylist playlist = new SongPlaylist();

        Song s1 = new Song("Dope");
        Song s2 = new Song("Fire");
        Song s3 = new Song("Fake love");
        Song s4 = new Song("Sapphire");
        Song s5 = new Song("Kolaveri");

        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);
        playlist.addSong(s4);
        Subscriber userKhushi = new Subscriber("khushi1245");
        Subscriber userTaman = new Subscriber("Taman6709");
        Subscriber userAayush = new Subscriber("12Aayush78");

        userKhushi.downloadSong(playlist, s1);
        userTaman.downloadSong(playlist, s2);

        userAayush.downloadSong(playlist, s5);
        userAayush.downloadSong(playlist, s1);
        userAayush.downloadSong(playlist, s4);

        userAayush.displayUserPlaylist();

        userAayush.deleteSong(s4);
        userAayush.displayUserPlaylist();
    }
}

package PlaySong;

public class PlatSong {
        String artist;
        String title;

        public PlatSong (String artist, String title) {
            this.artist = artist;
            this.title = title;
        }

        public void songPlay() {
            System.out.println(artist + " " + title);
        }
    }


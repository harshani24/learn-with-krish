package MementoSongPlaylistExample;

public class Song {
	
	private String songName;

	public Song(String songName) {
		this.songName = songName;
	}

	@Override
	public String toString() {
		return "Song [songName=" + songName + "]";
	}
	
	

}

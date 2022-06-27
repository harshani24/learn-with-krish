package MementoSongPlaylistExample;

import java.util.ArrayList;

//Originator Class
public class PlayList {
	
	ArrayList<Song> songList = new ArrayList<>();
	
	public void playSong(Song song) {
		songList.add(song);
	}

	//we return a clone from list
	public ArrayList<Song> getSongList() {
		return (ArrayList) songList.clone();
	}
	
	
	//---------Snapshots from the current playlist
	public PlayListMemento save() {
		return new PlayListMemento(getSongList());
	}
	
	
	public void revert(PlayListMemento playListMemento) {
		songList = playListMemento.getSongList();
	}

	@Override
	public String toString() {
		return "PlayList [songList=" + songList + "]";
	}
	
}

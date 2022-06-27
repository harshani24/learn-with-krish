package MementoSongPlaylistExample;

import java.util.Stack;



public class PlayListCareTaker {
	
	Stack<PlayListMemento>  playListHistory = new Stack<>();
	
	public void save(PlayList playList) {
		playListHistory.push(playList.save());
	}
	
	public void revert(PlayList playList) {
		
		if(!playListHistory.isEmpty())
			playList.revert(playListHistory.pop());
		else
			System.out.println("Cannot undo.No any playlist in the history");
	}

	@Override
	public String toString() {
		return "PlayListCareTaker [playListHistory=" + playListHistory + "]";
	}	

}

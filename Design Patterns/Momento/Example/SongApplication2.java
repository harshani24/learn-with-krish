package MementoSongPlaylistExample;

public class SongApplication2 {

	public static void main(String[] args) {
		
		PlayListCareTaker playListCareTaker = new PlayListCareTaker();
		
		PlayList playList = new PlayList();
		
		playList.playSong(new Song("song1"));
		playList.playSong(new Song("song2"));
		
		System.out.println(playList); //PlayList [songList=[Song [songName=song1], Song [songName=song2]]]
		System.out.println(playListCareTaker);//PlayListCareTaker [playListHistory=[]]
		playListCareTaker.save(playList);
		System.out.println(playListCareTaker);//1-->PlayListCareTaker [playListHistory=[
						//1.PlayListMemento [songList=[Song [songName=song1], Song [songName=song2]]]]]
		
		playList.playSong(new Song("song3"));
		//playListCareTaker.save(playList);
		System.out.println(playList); //PlayList [songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3]]]
		System.out.println(playListCareTaker);//1-->PlayListCareTaker [playListHistory=[
		               //1.PlayListMemento [songList=[Song [songName=song1], Song [songName=song2]]]]]
		
		System.out.println("-------------------------------We are going to revert our saved PLaylists------------------------------------------");
		
		playListCareTaker.revert(playList);
		System.out.println(playList); //PlayList [songList=[Song [songName=song1], Song [songName=song2]]]
		System.out.println(playListCareTaker);//PlayListCareTaker [playListHistory=[]]
		
		
		playListCareTaker.revert(playList);
		System.out.println(playList); //Cannot undo.No any playlist in the history
									  //PlayList [songList=[Song [songName=song1], Song [songName=song2]]] (Remain this is in current list)
		System.out.println(playListCareTaker); //PlayListCareTaker [playListHistory=[]]
		
		


	}

}

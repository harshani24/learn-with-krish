package MementoSongPlaylistExample;

public class SongApplication {

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
		playListCareTaker.save(playList);
		System.out.println(playList); //PlayList [songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3]]]
		System.out.println(playListCareTaker);//2-->PlayListCareTaker [playListHistory=
						//1.[PlayListMemento [songList=[Song [songName=song1], Song [songName=song2]]],
						//2.PlayListMemento [songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3]
		
		playList.playSong(new Song("song4"));
		playListCareTaker.save(playList);
		System.out.println(playList); //[songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3], Song [songName=song4]
		System.out.println(playListCareTaker);//3-->PlayListCareTaker [playListHistory=
						//1.[PlayListMemento [songList=[Song [songName=song1], Song [songName=song2]]],
						//2.PlayListMemento [songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3]
						//3.PlayListMemento [songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3], Song [songName=song4]
		
		System.out.println("-------------------------------We are going to revert our saved PLaylists------------------------------------------");
		
		playListCareTaker.revert(playList);
		System.out.println(playList); //PlayList [songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3], Song [songName=song4]]]
		System.out.println(playListCareTaker);//2-->PlayListCareTaker [playListHistory=[
		                     //1.PlayListMemento [songList=[Song [songName=song1], Song [songName=song2]]], 
		                     //2.PlayListMemento [songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3]]]]]
		
		playListCareTaker.revert(playList);
		System.out.println(playList);//PlayList [songList=[Song [songName=song1], Song [songName=song2], Song [songName=song3]]]
		System.out.println(playListCareTaker);//1-->PlayListCareTaker [playListHistory=[
		                     //1.PlayListMemento [songList=[Song [songName=song1], Song [songName=song2]]]]]
		
		playListCareTaker.revert(playList);
		System.out.println(playList); //PlayList [songList=[Song [songName=song1], Song [songName=song2]]]
		System.out.println(playListCareTaker); //PlayListCareTaker [playListHistory=[]]
		
		playListCareTaker.revert(playList);
		System.out.println(playList); //Cannot undo.No any playlist in the history
									  //PlayList [songList=[Song [songName=song1], Song [songName=song2]]] (Remain this is in current list)
		System.out.println(playListCareTaker); //PlayListCareTaker [playListHistory=[]]
		
		


	}

}

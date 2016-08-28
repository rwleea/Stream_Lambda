package com.rw.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.rw.dto.Album;
import com.rw.dto.Track;
import com.rw.sudo.TestData;

public class App {
	public static void main(String args[]){
		
		List<Album> albums = TestData.getTestData();
		
		List<String> trackNames = new ArrayList<String>();
		for(Album album: albums){
			List<Track> trackList = album.getTrackLsit();
			trackNames.addAll(longTrackNames(trackList));
		}
		
		System.out.println(trackNames);
	}
	
	private static Set<String> longTrackNames(List<Track> tracklist){
		/*List<Track> longTracks = findTrackOverOneMin(tracklist);//filter length>60
		return CollectTrackNames(longTracks);//map list<track> list<string>
*/
		
		
		return   tracklist.stream()
				.filter(track -> track.getLength() > 60)// predicate  Track-->true/false 給stream的其中一個東西 回boolean
				.map(track -> track.getName())//Function 給stream的其中一個東西  回傳處理結果
				.collect(Collectors.toSet());

		
		
	}
	//filter
	private static List<Track> findTrackOverOneMin(List<Track> tracklist){
		List<Track> longtrackList = new ArrayList<Track>();
		for(Track track: tracklist){
			if(track.getLength() > 60){
				longtrackList.add(track);
			}
		}
		return longtrackList;
	}
	//map
	private static Set<String> CollectTrackNames(List<Track> tracklist){
		Set<String> longtrackList = new HashSet<String>();
		for(Track track: tracklist){
			longtrackList.add(track.getName());
		}
		return longtrackList;
	}
}

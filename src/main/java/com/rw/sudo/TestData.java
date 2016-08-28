package com.rw.sudo;

import java.util.ArrayList;
import java.util.List;

import com.rw.dto.Album;
import com.rw.dto.Track;

public class TestData {
	public static List<Album> getTestData(){
		List<Album>  albums= new ArrayList<Album>();
		List<Track> trackLista = new ArrayList<Track>();
	 	Track track1 = new Track("tracka1",10);
		Track track2 = new Track("tracka2",70);
		Track track3 = new Track("tracka3",80);
		trackLista.add(track1);
		trackLista.add(track2);
		trackLista.add(track3);
		
		Album album = new Album();
		album.setTrackLsit(trackLista);
		
		
		List<Track> trackListb = new ArrayList<Track>();
		Track trackb1 = new Track("trackb1",70);
		Track trackb2 = new Track("trackb2",80);
		Track trackb3 = new Track("trackb3",10);
		trackListb.add(trackb1);
		trackListb.add(trackb2);
		trackListb.add(trackb3);
		
		Album albumb = new Album();
		albumb.setTrackLsit(trackListb);
		
		
		albums.add(album);
		albums.add(albumb);
		
		return albums;
	}
	
}

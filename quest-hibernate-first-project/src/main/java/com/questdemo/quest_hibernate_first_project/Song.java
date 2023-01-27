package com.questdemo.quest_hibernate_first_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //represents a table in db 
public class Song {

	@Id
	@Column(name= "songId")
	private int id;
	private String songName;
	@Column(name= "singer")
	private String artist;
	
	//create getter & setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	
	
	
}

package br.edu.atitus.poo.atitusound.entities;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_playlist")
public class PlaylistEntity extends GenericEntity{

	@Column(name = "public_share")
	private boolean publicShare;
	
	@ManyToAny(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_playlist_music",
				joinColumns = @JoinColumn(name = "playlist_uuid"),
				inverseJoinColumns = @JoinColumn(name = "music_uuid"))
	private List<MusicEntity> musics;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_uuid", nullable = false)
	private UserEntity user;

	public boolean getPublicshare() {
		return publicShare;
	}

	public void setPublicshare(boolean publicShare) {
		this.publicShare = publicShare;
	}

	public List<MusicEntity> getMusics() {
		return musics;
	}

	public void setMusics(List<MusicEntity> musics) {
		this.musics = musics;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	
}

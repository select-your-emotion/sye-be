package dev.music.sye.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SONGINFO")
public class SongInfo {

    // 일련번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SONGINFO_NUMBER", nullable = false, unique = true)
    private Long songInfoNumber;

    // 노래제목
    @Column(name="SONGINFO_NAME", nullable = false)
    private String songInfoName;

    // 가수
    @Column(name="SONGINFO_SINGER", nullable = false)
    private String songInfoSinger;

    // 앨범 이미지 Url
    @Column(name="SONGINFO_ALBUMURL", nullable = true)
    private String songInfoAlbumUrl;

    // 앨범이름
    @Column(name="SONGINFO_ALBUM", nullable = false)
    private String songInfoAlbum;

    // 리스트번호
    @ManyToOne
    @JoinColumn(name="PLAYLIST_NUMBER")
    private PlayList playList;

    
    // Getter, Setter
    public Long getSongInfoNumber() {
        return songInfoNumber;
    }

    public void setSongInfoNumber(Long songInfoNumber) {
        this.songInfoNumber = songInfoNumber;
    }

    public String getSongInfoName() {
        return songInfoName;
    }

    public void setSongInfoName(String songInfoName) {
        this.songInfoName = songInfoName;
    }

    public String getSongInfoSinger() {
        return songInfoSinger;
    }

    public void setSongInfoSinger(String songInfoSinger) {
        this.songInfoSinger = songInfoSinger;
    }

    public String getSongInfoAlbumUrl() {
        return songInfoAlbumUrl;
    }

    public void setSongInfoAlbumUrl(String songInfoAlbumUrl) {
        this.songInfoAlbumUrl = songInfoAlbumUrl;
    }

    public String getSongInfoAlbum() {
        return songInfoAlbum;
    }

    public void setSongInfoAlbum(String songInfoAlbum) {
        this.songInfoAlbum = songInfoAlbum;
    }

    public PlayList getPlayList() {
        return playList;
    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }

}

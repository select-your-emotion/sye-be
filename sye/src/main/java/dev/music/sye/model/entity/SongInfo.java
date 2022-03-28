package dev.music.sye.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SONGINFO")
public class SongInfo {

    // 일련번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SONGINFO_NUMBER")
    private Long songInfoNumber;

    // 노래제목
    private String songInfoName;

    // 가수
    private String songInfoSinger;

    // 앨범 이미지 Url
    private String songInfoAlbumUrl;

    // 앨범이름
    private String songInfoAlbum;

    // 재생시간
    private String songInfoTime;

    // 리스트번호
    private Long playListNumber;

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

    public String getSongInfoTime() {
        return songInfoTime;
    }

    public void setSongInfoTime(String songInfoTime) {
        this.songInfoTime = songInfoTime;
    }

    public Long getPlayListNumber() {
        return playListNumber;
    }

    public void setPlayListNumber(Long playListNumber) {
        this.playListNumber = playListNumber;
    }

    
    
}

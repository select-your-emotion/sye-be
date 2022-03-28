package dev.music.sye.model.dto;

public class SongInfoDTO {

    // 일련번호
    private Long songInfoNumber;

    // 노래제목
    private String songInfoName;

    // 가수
    private String songInfoSinger;

    // 앨범이미지 Url
    private String songInfoAlbumUrl;

    // 앨범이름
    private String songInfoAlbum;

    // 재생시간
    private String songInfoTime;

    // 리스트번호
    private Long playListNumber;

    // Constructor
    public SongInfoDTO(Long songInfoNumber, String songInfoName, String songInfoSinger, String songInfoAlbumUrl,
            String songInfoAlbum, String songInfoTime, Long playListNumber) {
        this.songInfoNumber = songInfoNumber;
        this.songInfoName = songInfoName;
        this.songInfoSinger = songInfoSinger;
        this.songInfoAlbumUrl = songInfoAlbumUrl;
        this.songInfoAlbum = songInfoAlbum;
        this.songInfoTime = songInfoTime;
        this.playListNumber = playListNumber;
    }

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

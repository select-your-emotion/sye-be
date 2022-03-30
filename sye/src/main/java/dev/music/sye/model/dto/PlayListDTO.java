package dev.music.sye.model.dto;

import dev.music.sye.model.entity.PlayList;

public class PlayListDTO {

    // 리스트번호
    private Long playListNumber;
    
    // 리스트이름
    private String playListName;

    // 리스트 썸네일 이미지
    private String playListThumbnail;

    // 좋아요 수
    private int playListFollow;

    
    // Constructor
    public PlayListDTO(Long playListNumber, String playListName, String playListThumbnail, int playListFollow) {
        this.playListNumber = playListNumber;
        this.playListName = playListName;
        this.playListThumbnail = playListThumbnail;
        this.playListFollow = playListFollow;
    }

    public PlayListDTO(PlayList playList) {
        this.playListNumber = playList.getPlayListNumber();
        this.playListName = playList.getPlayListName();
        this.playListThumbnail = playList.getPlayListThumbnail();
        this.playListFollow = playList.getPlayListFollow();
    }


    // Getter, Setter
    public void setPlayListThumbnail(String playListThumbnail) {
        this.playListThumbnail = playListThumbnail;
    }

    public void setPlayListNumber(Long playListNumber) {
        this.playListNumber = playListNumber;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public Long getPlayListNumber() {
        return playListNumber;
    }

    public String getPlayListThumbnail() {
        return playListThumbnail;
    }

    public int getPlayListFollow() {
        return playListFollow;
    }

    public void setPlayListFollow(int playListFollow) {
        this.playListFollow = playListFollow;
    }
    
}

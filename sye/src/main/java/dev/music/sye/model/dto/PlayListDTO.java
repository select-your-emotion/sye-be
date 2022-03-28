package dev.music.sye.model.dto;

public class PlayListDTO {

    // 리스트번호
    private Long playListNumber;
    
    // 리스트이름
    private String playListName;

    // 좋아요 수
    private int playListFollow;

    // Getter, Setter
    public Long getPlayListNumber() {
        return playListNumber;
    }

    // Constructor
    public PlayListDTO(Long playListNumber, String playListName, int playListFollow) {
        this.playListNumber = playListNumber;
        this.playListName = playListName;
        this.playListFollow = playListFollow;
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

    public int getPlayListFollow() {
        return playListFollow;
    }

    public void setPlayListFollow(int playListFollow) {
        this.playListFollow = playListFollow;
    }
    
}

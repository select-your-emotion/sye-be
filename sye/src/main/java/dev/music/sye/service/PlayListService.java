package dev.music.sye.service;

import java.util.List;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.model.dto.SongInfoDTO;

public interface PlayListService {
    
    // 플레이리스트 추가
    PlayListDTO addPlayList(PlayListDTO playListDTO);

    // 생성되어 있는 플레이리스트 목록 보여주기
    List<PlayListDTO> showPlayList();

    // 플레이리스트 이름 변경
    void updatePlayList(String currentName, String toChangeName);
    
    // 플레이리스트 삭제
    void deletePlayList(PlayListDTO playListDTO);

    // 플레이리스트의 노래들을 전부 반환
    List<SongInfoDTO> showSongList(PlayListDTO playListDTO);
    
}

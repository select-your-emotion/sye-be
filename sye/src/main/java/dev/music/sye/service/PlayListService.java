package dev.music.sye.service;

import java.util.List;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.model.dto.SongInfoDTO;


public interface PlayListService {
    
    // 플레이리스트 추가
    void addPlayList(PlayListDTO playListDTO);

    // 플레이리스트 DTO들을 반환해주는 서비스
    List<PlayListDTO> showPlayList();
    
    // 플레이리스트 삭제
    void deletePlayList(PlayListDTO playListDTO);

    // 플레이리스트의 노래들을 전부 반환
    List<SongInfoDTO> showSongList(PlayListDTO playListDTO);

    // 좋아요 카운트
    List<PlayListDTO> increaseFollow();
    
}

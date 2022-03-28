package dev.music.sye.service;

import java.util.List;

import dev.music.sye.model.dto.PlayListDTO;


public interface PlayListService {
    
    // 플레이리스트 추가
    List<PlayListDTO> addPlayList();

    // 플레이리스트 이름 변경
    List<PlayListDTO> updatePlayList(String name);
    
    // 플레이리스트 삭제
    List<PlayListDTO> deletePlayList();
    
}

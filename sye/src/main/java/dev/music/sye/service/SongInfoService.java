package dev.music.sye.service;

import java.util.List;

import dev.music.sye.model.dto.SongInfoDTO;

public interface SongInfoService {

    // 플레이리스트에 노래 추가
    List<SongInfoDTO> addSong();

    // 플레이리스트에서 노래 삭제
    List<SongInfoDTO> deleteSong();
    
}

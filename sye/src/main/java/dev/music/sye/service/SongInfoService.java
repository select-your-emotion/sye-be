package dev.music.sye.service;

import dev.music.sye.model.dto.SongInfoDTO;

public interface SongInfoService {

    // 플레이리스트에 노래 추가
    void addSong(SongInfoDTO songInfoDTO);

    // 플레이리스트에서 노래 삭제
    void deleteSong(SongInfoDTO songInfoDTO);

}

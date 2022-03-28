package dev.music.sye.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.music.sye.model.dto.SongInfoDTO;
import dev.music.sye.repository.PlayListRepository;
import dev.music.sye.repository.SongInfoRepository;

@Service
public class SongInfoServiceImpl implements SongInfoService{

    @Autowired
    private SongInfoRepository songInfoRepository;

    @Autowired
    private PlayListRepository playListRepository;

    // 플레이리스트에 노래 추가
    @Override
    public List<SongInfoDTO> addSong(){
        return null;
    }

    // 플레이리스트에서 노래 삭제
    @Override
    public List<SongInfoDTO> deleteSong(){
        return null;
    }
    
}

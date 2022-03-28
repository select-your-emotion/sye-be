package dev.music.sye.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.repository.PlayListRepository;

@Service
public class PlayListServiceImpl implements PlayListService{

    @Autowired
    private PlayListRepository playListRepository;

    // 플레이리스트 추가
    @Override
    public List<PlayListDTO> addPlayList() {
        return null;
    }

    // 플레이리스트 이름 변경
    @Override
    public List<PlayListDTO> updatePlayList(String name){
        return null;
    }
    
    // 플레이리스트 삭제
    @Override
    public List<PlayListDTO> deletePlayList(){
        return null;
    }

}

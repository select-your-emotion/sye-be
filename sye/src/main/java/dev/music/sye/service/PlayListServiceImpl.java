package dev.music.sye.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.model.entity.PlayList;
import dev.music.sye.repository.PlayListRepository;

@Service
public class PlayListServiceImpl implements PlayListService{

    @Autowired
    private PlayListRepository playListRepository;

    // 플레이리스트 추가
    @Override
    public void addPlayList(PlayListDTO playListDTO) {

        // 테이블에 저장할 PlayList Entity 생성
        PlayList playList = new PlayList();
        playList.setPlayListName(playListDTO.getPlayListName());

        playListRepository.save(playList);
        
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

    // 좋아요 수 증가
    @Override
    public List<PlayListDTO> increaseFollow(){
        return null;
    }

}

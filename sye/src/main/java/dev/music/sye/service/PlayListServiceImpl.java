package dev.music.sye.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.model.entity.PlayList;
import dev.music.sye.model.entity.SongInfo;
import dev.music.sye.repository.PlayListRepository;
import dev.music.sye.repository.SongInfoRepository;

@Service
public class PlayListServiceImpl implements PlayListService{

    @Autowired
    private PlayListRepository playListRepository;

    // @Autowired
    // private SongInfoRepository songInfoRepository;

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
    public void deletePlayList(PlayListDTO playListDTO){

        // Foreign Key 관계를 맺고 있는 SongInfo 엔티티부터 삭제하기 위해 Repository에서 데이터 추출
        // 1. playListRepository에서 playListName에 해당하는 playListNumber 추출
        // PlayList playList = playListRepository.findByPlayListName(playListDTO.getPlayListName());
        // PlayList playList = playListRepository.findByPlayListName(playListDTO.getPlayListName());
        // Long playListNumber = playListRepository.findByPlayListName(playListDTO.getPlayListName()).getPlayListNumber();

        // System.out.println("playListNumber" + playListNumber);

        /*
        // 2. playListNumber에 해당하는 songInfo 엔티티들을 List로 담은 뒤 삭제쿼리 실행
        List<SongInfo> songInfoList = songInfoRepository.findAllByPlayListNumber(playListNumber);
        int cnt = 0;
        for(SongInfo songInfo : songInfoList){
            System.out.println("cnt : " + ++cnt);
            songInfoRepository.delete(songInfo);
        }

        System.out.println("cnt : " + cnt);
        */

        PlayList playList = playListRepository.findByPlayListName(playListDTO.getPlayListName());
        playListRepository.delete(playList);
    }

    // 좋아요 수 증가
    @Override
    public List<PlayListDTO> increaseFollow(){
        return null;
    }

}

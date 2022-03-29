package dev.music.sye.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.music.sye.model.dto.SongInfoDTO;
import dev.music.sye.model.entity.PlayList;
import dev.music.sye.model.entity.SongInfo;
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
    public List<SongInfoDTO> addSong(SongInfoDTO songInfoDTO){

        // songInfoDTO body의 playListName으로 playListRepository에 있는 playList 엔티티 검색
        PlayList playList = playListRepository.findByPlayListName(songInfoDTO.getPlayListName());

        // 테이블에 저장할 SongInfo 생성
        SongInfo songInfo = new SongInfo();
        songInfo.setSongInfoName(songInfoDTO.getSongInfoName());
        songInfo.setSongInfoSinger(songInfoDTO.getSongInfoSinger());
        songInfo.setSongInfoAlbum(songInfoDTO.getSongInfoAlbum());
        songInfo.setSongInfoTime("2:25");

        // 맵핑
        songInfo.setPlayList(playList);
                             
        // 저장
        songInfoRepository.save(songInfo);
        return null;
    }

    // 플레이리스트에서 노래 삭제
    @Override
    public List<SongInfoDTO> deleteSong(SongInfoDTO songinfoDTO){
        SongInfo songInfo = songInfoRepository.findBySongInfoName(songinfoDTO.getSongInfoName());
        songInfoRepository.delete(songInfo);

        return null;
    }
    
}

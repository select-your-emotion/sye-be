package dev.music.sye.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.model.dto.SongInfoDTO;
import dev.music.sye.model.entity.PlayList;
import dev.music.sye.model.entity.SongInfo;
import dev.music.sye.repository.PlayListRepository;
import dev.music.sye.repository.SongInfoRepository;

@Service
public class PlayListServiceImpl implements PlayListService{

    @Autowired
    private PlayListRepository playListRepository;

    @Autowired
    private SongInfoRepository songInfoRepository;

    // 플레이리스트 추가
    @Override
    public PlayListDTO addPlayList(PlayListDTO playListDTO) {

        // 테이블에 저장할 PlayList Entity 생성
        PlayList playList = new PlayList();
        playList.setPlayListName(playListDTO.getPlayListName());

        // 랜덤으로 플레이리스트 썸네일 추출 및 Entity 에 세팅
        String[] representativeThumbnail = { "https://firebasestorage.googleapis.com/v0/b/sye-image.appspot.com/o/playlist.jpg?alt=media",
                                             "https://firebasestorage.googleapis.com/v0/b/sye-image.appspot.com/o/playlist2.jpg?alt=media",
                                             "https://firebasestorage.googleapis.com/v0/b/sye-image.appspot.com/o/playlist3.png?alt=media",
                                             "https://firebasestorage.googleapis.com/v0/b/sye-image.appspot.com/o/playlist4.png?alt=media",
                                             "https://firebasestorage.googleapis.com/v0/b/sye-image.appspot.com/o/playlist5.jpg?alt=media",
                                             "https://firebasestorage.googleapis.com/v0/b/sye-image.appspot.com/o/playlist6.jpg?alt=media" };

        String randomThumbnail = representativeThumbnail[(int)(Math.random() * 6)];
        playList.setPlayListThumbnail(randomThumbnail);

        // PLAYLIST DB에 저장
        playListRepository.save(playList);

        // 생성한 플레이리스트의 정보를 반환
        return (new PlayListDTO(playList));
        
    }

    // 생성되어 있는 플레이리스트 목록 보여주기
    @Override
    public List<PlayListDTO> showPlayList(){
        List<PlayList> playListsGroup = playListRepository.findAll();
        List<PlayListDTO> playLists = playListsGroup.stream().map(v -> new PlayListDTO(v)).collect(Collectors.toList());

        return playLists;
    }

    // 플레이리스트 이름 변경
    @Override
    @Transactional
    public void updatePlayList(String currentName, String toChangeName) {

        // 실행될 쿼리문
        // UPDATE PLAYLIST SET PLAYLIST_NAME = ? WHERE PLAYLIST_NUMBER = ?

        Long playListNumber = playListRepository.findByPlayListName(currentName).getPlayListNumber();
        playListRepository.updatePlayListName(toChangeName, playListNumber);

    }
    
    // 플레이리스트 삭제
    @Override
    public void deletePlayList(PlayListDTO playListDTO){

        PlayList playList = playListRepository.findByPlayListName(playListDTO.getPlayListName());
        playListRepository.delete(playList);

    }

    @Override
    public List<SongInfoDTO> showSongList(PlayListDTO playListDTO){
        PlayList playList = playListRepository.findByPlayListName(playListDTO.getPlayListName());

        // 반환할 플레이리스트의 노래들 목록 작성
        List<SongInfo> songs = songInfoRepository.findAllByPlayList(playList);
        List<SongInfoDTO> songList = songs.stream().map(v -> new SongInfoDTO(v)).collect(Collectors.toList());

        return songList;
    }

}

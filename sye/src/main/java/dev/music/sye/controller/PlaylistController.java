package dev.music.sye.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.model.dto.SongInfoDTO;
import dev.music.sye.service.PlayListService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/playlists")
public class PlaylistController {
    
    private final PlayListService playListService;

    public PlaylistController(PlayListService playListService){
        this.playListService = playListService;
    }

    // 플레이 리스트 추가
    @PostMapping("/addplaylist")
    public PlayListDTO addPlayList(@RequestBody PlayListDTO playListDTO) {
        return playListService.addPlayList(playListDTO);
    }

    // 생성되어 있는 플레이리스트 목록 보여주기
    @GetMapping()
    public List<PlayListDTO> showPlayList() {
        return playListService.showPlayList();
    }

    // 플레이리스트 이름 변경
    @PutMapping()
    public void updatePlayList(@RequestParam String currentName, @RequestParam String toChangeName) {
        playListService.updatePlayList(currentName, toChangeName);
    }

    // 플레이리스트 삭제
    @DeleteMapping()
    public void deletePlayList(@RequestBody PlayListDTO playListDTO) {
        playListService.deletePlayList(playListDTO);                
    }

    // 플레이리스트에 있는 노래들 전부 반환
    @PostMapping("/showsonglist")
    public List<SongInfoDTO> showSongList(@RequestBody PlayListDTO playListDTO) {
        return playListService.showSongList(playListDTO);
    }

}

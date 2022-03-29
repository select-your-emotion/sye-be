package dev.music.sye.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.music.sye.model.dto.PlayListDTO;
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
    @PostMapping("/addPlayList")
    public void addPlayList(@RequestBody PlayListDTO playListDTO) {
        playListService.addPlayList(playListDTO);
        System.out.println("addPlayList called!");
    }

    // 플레이리스트 이름 변경
    @PostMapping("/updatePlayList")
    public void updatePlayList() {
        System.out.println("updatePlayList called!");
    }

    // 플레이리스트 삭제
    @PostMapping("/deletePlayList")
    public void deletePlayList(@RequestBody PlayListDTO playListDTO) {
        playListService.deletePlayList(playListDTO);
        System.out.println("deletePlayList called!");                
    }

    // 좋아요 수 증가
    @PostMapping("/increaseFollow")
    public void increaseFollow(@RequestParam String playListName) {
        System.out.println("increaseFollow called!");
    }

    /*
    @GetMapping("/showList")
    public void showList(@RequestParam String playListName) {
        System.out.println("showList called!");        
    }
    */

}
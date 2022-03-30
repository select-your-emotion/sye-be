package dev.music.sye.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.model.dto.SongInfoDTO;
import dev.music.sye.service.SongInfoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/songinfo")
public class SongInfoController {

    private final SongInfoService songInfoService;

    public SongInfoController(SongInfoService songInfoService) {
        this.songInfoService = songInfoService;
    }

    // 플레이리스트에 노래 추가
    @PostMapping("/addsong")
    //public void addPlayList(@RequestParam PlayListDTO playListDTO) {
    public void addSong(@RequestBody SongInfoDTO songInfoDTO ) {
        songInfoService.addSong(songInfoDTO);
        // System.out.println("addSong called!");
    }

    // 플레이리스트에서 노래 삭제
    @PostMapping("/deletesong")
    public void deleteSong(@RequestBody SongInfoDTO songInfoDTO) {
        songInfoService.deleteSong(songInfoDTO);
        // System.out.println("deleteSong called!");
    }

}

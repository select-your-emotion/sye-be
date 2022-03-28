package dev.music.sye.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.music.sye.service.PlaylistService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/playlists")
public class PlaylistController {
    
    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService){
        this.playlistService = playlistService;
    }

    @PostMapping()
    public void insertSong() {

    }

    @GetMapping()
    public void showList() {
        
    }

}

package dev.music.sye.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.music.sye.model.entity.SongInfo;

public interface SongInfoRepository extends JpaRepository<SongInfo, Long>{
    SongInfo findBySongInfoName(String playListName);
}

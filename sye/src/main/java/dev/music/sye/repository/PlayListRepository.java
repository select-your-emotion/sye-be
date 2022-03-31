package dev.music.sye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import dev.music.sye.model.entity.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList, Long>{
    PlayList findByPlayListName(String playListName);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(value = "UPDATE PLAYLIST SET PLAYLIST_NAME = :toChangeName WHERE PLAYLIST_NUMBER = :playListNumber", nativeQuery = true)
    int updatePlayListName(String toChangeName, Long playListNumber);
}

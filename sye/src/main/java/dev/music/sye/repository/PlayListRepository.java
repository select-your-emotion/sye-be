package dev.music.sye.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.music.sye.model.entity.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList, Long>{

}

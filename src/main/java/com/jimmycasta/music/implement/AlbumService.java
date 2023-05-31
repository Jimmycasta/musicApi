package com.jimmycasta.music.implement;

import com.jimmycasta.music.entity.Album;
import com.jimmycasta.music.repository.AlbumRepository;
import com.jimmycasta.music.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService implements IAlbumService {

    @Autowired
    private AlbumRepository albumRepository;
    @Override
    public List<Album> buscarTodos() {
        return albumRepository.findAll();
    }
}

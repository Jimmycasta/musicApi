package com.jimmycasta.music.controller;

import com.jimmycasta.music.entity.Album;
import com.jimmycasta.music.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    @GetMapping("/album")
    public List<Album> buscarTodos(){
        return albumService.buscarTodos();
    }
}

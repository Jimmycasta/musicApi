package com.jimmycasta.music.controller;

import com.jimmycasta.music.entity.Album;
import com.jimmycasta.music.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    @GetMapping("/album")
    public List<Album> buscarTodos() {
        return albumService.buscarTodos();
    }

    @PostMapping("/album")
    public Album guardar(@RequestBody Album album) {
        albumService.guardar(album);
        return album;
    }

    @PutMapping("/album")
    public Album actualizar(@RequestBody Album album) {
        albumService.guardar(album);
        return album;
    }
    @DeleteMapping("/album/{id}")
    public String eliminar(@PathVariable("id") int id){
        albumService.eliminar(id);
        return "Registro eliminado";
    }
}

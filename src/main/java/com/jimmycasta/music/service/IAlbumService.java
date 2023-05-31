package com.jimmycasta.music.service;

import com.jimmycasta.music.entity.Album;

import java.util.List;

public interface IAlbumService {
    List<Album>buscarTodos();
    void guardar(Album album);
    void eliminar(int id);
}

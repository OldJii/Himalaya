package com.example.himalaya.interfaces;

import android.support.constraint.solver.LinearSystem;

import com.ximalaya.ting.android.opensdk.model.album.Album;
import com.ximalaya.ting.android.opensdk.model.track.Track;

import java.util.List;

public interface IAlbumDetailViewCallback {

    /**
     * 加载专辑详情内容
     *
     * @param tracks
     */
    void onDetailListLoaded(List<Track> tracks);

    /**
     * 把Album传给UI使用
     *
     * @param album
     */
    void onAlbumLoaded(Album album);
}

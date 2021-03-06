package com.example.himalaya.interfaces;

public interface IAlbumDetailPresenter {

    /**
     * 下拉刷新更多
     */
    void pull2RefreshMore();

    /**
     * 上滑加载更多
     */
    void loadMore();

    /**
     *获取专辑详情
     *
     * @param albumId
     * @param page
     */
    void getAlbumDetail(int albumId, int page);

    /**
     * 注册UI通知的接口
     *
     * @param detailViewCallback
     */
    void registerViewCallback(IAlbumDetailViewCallback detailViewCallback);

    /**
     * 删除UI通知接口的注册
     *
     * @param detailViewCallback
     */
    void unregisterViewCallback(IAlbumDetailViewCallback detailViewCallback);
}

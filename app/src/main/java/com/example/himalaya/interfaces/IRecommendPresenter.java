package com.example.himalaya.interfaces;

public interface IRecommendPresenter {

    /**
     * 获取推荐内容
     */
    void getRecommendList();

    /**
     * 下拉刷新更多
     */
    void pull2RefreshMore();

    /**
     * 上滑加载更多
     */
    void loadMore();

    /**
     * 这个方法用于注册ui的回调
     *
     * @param callback
     */
    void registerViewCallback(IRecommendViewCallback callback);

    /**
     * 取消ui的回调注册
     *
     * @param callback
     */
    void unRegisterViewCallback(IRecommendViewCallback callback);
}

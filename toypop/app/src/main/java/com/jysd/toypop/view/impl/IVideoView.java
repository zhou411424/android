package com.jysd.toypop.view.impl;


import com.jysd.toypop.inter.AbsVideoRes;

import java.util.List;

/**
 * Created by sysadminl on 2015/12/9.
 */
public interface IVideoView extends IBaseView {

    void setAdapter(List<? extends AbsVideoRes> list);

    void loadMore(List<? extends AbsVideoRes> list);

    void onRefreshComplete();

    void onLoadMoreComplete();

    void showSuccess();

    void showFaild();

    void showEmpty();

    boolean checkNet();

    void showNoNet();
}

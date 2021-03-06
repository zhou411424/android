package com.jysd.toypop.view.impl;


import com.jysd.toypop.bean.Juzimi;

import java.util.List;

/**
 * Created by sysadminl on 2015/12/9.
 */
public interface IPictureView extends IBaseView {

    void setAdapter(List<Juzimi> list);

    void loadMore(List<Juzimi> list);

    void onRefreshComplete();

    void onLoadMoreComplete();

    void showSuccess();

    void showEmpty();

    boolean checkNet();

    void showFaild();

    void showNoNet();
}

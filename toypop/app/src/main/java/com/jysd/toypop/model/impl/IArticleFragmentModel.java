package com.jysd.toypop.model.impl;


import com.jysd.toypop.bean.Lz13;
import com.jysd.toypop.inter.Callback;

import java.util.List;
import java.util.Map;

/**
 * Created by sysadminl on 2016/1/18.
 */
public interface IArticleFragmentModel extends BaseModel{

    void parserLZ13(Map<String, String> params, Callback<List<Lz13>> mCallback);

}

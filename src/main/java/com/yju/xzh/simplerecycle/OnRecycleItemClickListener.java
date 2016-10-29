package com.yju.xzh.simplerecycle;

import android.view.View;

public interface OnRecycleItemClickListener<T> {
    void onItemClick(View view, int position, T data);
}
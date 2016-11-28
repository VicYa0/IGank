

package me.drakeet.meizhi.func;

import android.view.View;

import me.drakeet.meizhi.data.entity.Meizhi;


public interface OnMeizhiTouchListener {
    void onTouch(View v, View meizhiView, View card, Meizhi meizhi);
}



package me.drakeet.meizhi.ui.base;

import me.drakeet.meizhi.widget.MultiSwipeRefreshLayout;

public interface SwipeRefreshLayer {

    void requestDataRefresh();

    void setRefresh(boolean refresh);

    void setProgressViewOffset(boolean scale, int start, int end);

    void setCanChildScrollUpCallback(MultiSwipeRefreshLayout.CanChildScrollUpCallback callback);
}



package me.drakeet.meizhi.data;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;
import me.drakeet.meizhi.data.entity.DGank;

public class DGankData {

    @Expose public List<DGank> results = new ArrayList<DGank>();
}

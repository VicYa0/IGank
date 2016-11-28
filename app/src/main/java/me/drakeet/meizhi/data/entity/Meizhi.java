

package me.drakeet.meizhi.data.entity;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.Table;
import java.util.Date;

@Table("meizhis") public class Meizhi extends Soul {

    @Column("url") public String url;
    @Column("type") public String type;
    @Column("desc") public String desc;
    @Column("who") public String who;
    @Column("used") public boolean used;
    @Column("createdAt") public Date createdAt;
    @Column("updatedAt") public Date updatedAt;
    @Column("publishedAt") public Date publishedAt;
    @Column("imageWidth") public int imageWidth;
    @Column("imageHeight") public int imageHeight;
}

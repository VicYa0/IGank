

package me.drakeet.meizhi.data.entity;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.PrimaryKey;
import java.io.Serializable;

public class Soul implements Serializable {

    @PrimaryKey(PrimaryKey.AssignType.AUTO_INCREMENT) @Column("_id") public long id;
}

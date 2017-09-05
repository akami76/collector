package com.akami.clearview.db;

import com.akami.clearview.domain.PointMark;

import javax.inject.Named;
import java.util.List;

/**
 * Created by akamikang on 2017. 7. 17..
 */
@Named
public interface PointMarkDAO {

    List<PointMark> getPointMarkList(String[] cv_req_id_list);
}

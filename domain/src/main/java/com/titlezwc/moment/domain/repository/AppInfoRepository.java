package com.titlezwc.moment.domain.repository;


import com.titlezwc.moment.domain.module.AppInfo;

import rx.Observable;

/**
 * Created by TitleZWC on 2016/12/23.
 */

public interface AppInfoRepository {
    Observable<AppInfo> appModel();
}

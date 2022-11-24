package com.kusitms7team.aos

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "4f444e8815868b65a842725e9610b1d0")
    }
}
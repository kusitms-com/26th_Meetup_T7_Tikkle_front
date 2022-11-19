package com.kusitms7team.aos;

import retrofit2.Call
import retrofit2.http.*
import com.kusitms7team.aos.extraInfoBody
import com.kusitms7team.aos.extraInfoRes

interface APIS {

    @POST("login/extraInfo/{id}")
    fun extraInfo(
        @Path("id") id : Int,
        @Body request : extraInfoBody
    ): Call<extraInfoRes>
    /* 머지용 */

}

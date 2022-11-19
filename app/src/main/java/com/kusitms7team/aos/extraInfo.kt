package com.kusitms7team.aos
import com.google.gson.annotations.SerializedName

data class extraInfoBody(
    @SerializedName("nickname") var nickname : String,
    @SerializedName("intro") var intro : String,
    @SerializedName("profileImage") var profileImage : Int,
    @SerializedName("monthlyIncome") var monthlyIncome : Int,
    @SerializedName("savingCost") var savingCost : Int,
    @SerializedName("fixedCost") var fixedCost : Int
)

data class extraInfoRes(
    @SerializedName("nickname") var nickname : String,
    @SerializedName("comde") var code : Int,
    @SerializedName("result") var result : extraInfoResResult
)

data class extraInfoResResult (
    @SerializedName("responseType") var responseType : String,
    @SerializedName("id") var id : Long,
    @SerializedName("role") var role : RoleType,
    @SerializedName("accessToken") var accessToken : String
    )


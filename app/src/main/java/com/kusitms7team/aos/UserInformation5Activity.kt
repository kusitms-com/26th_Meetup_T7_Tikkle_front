package com.kusitms7team.aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class UserInformation5Activity : AppCompatActivity() {

    lateinit var btnBack : ImageButton
    lateinit var btnNext : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information5)

        /* 뒤로가기 버튼 클릭 리스너 */
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        /* 다음 페이지 버튼 클릭 리스너 */
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener{

            /* intent에 유저 정보 담아서 home으로 */

            finish()
            startActivity(intent)

        }
    }
}
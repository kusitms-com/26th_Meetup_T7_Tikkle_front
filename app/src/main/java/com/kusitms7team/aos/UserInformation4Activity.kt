package com.kusitms7team.aos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class UserInformation4Activity : AppCompatActivity() {

    lateinit var btnBack : ImageButton
    lateinit var btnNext : ImageButton
    lateinit var btnHold : ImageButton
    lateinit var enterFixedCost : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information4)

        /* 개인정보 수집 페이지 3 정보 받아오기 */
        var nick = intent.getStringExtra("nick")
        var introduction = intent.getStringExtra("introduction")
        var profileImgList = intent.getStringExtra("profileImgList")
        var income = intent.getStringExtra("income")
        var saving = intent.getStringExtra("saving")

        enterFixedCost = findViewById(R.id.enterFixedCost)

        /* 뒤로가기 버튼 클릭 리스너 */
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        /* 다음 페이지 버튼 클릭 리스너 */
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener{

            val fixedCost = enterFixedCost.text.toString()

            /* 유저가 항목을 채우지 않았을 경우 */
            if (fixedCost.length == 0) {
                Toast.makeText(this, "한 달 고정 비용을 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
            else {
                /* 서버에 데이터 보내기 구현부 */

                val intent = Intent(this, UserInformation5Activity::class.java)
                finish()
                startActivity(intent)
            }
        }

        btnHold = findViewById(R.id.btnHold)
        btnHold.setOnClickListener{

            val fixedCost = -1

            /* 서버에 데이터 보내기 구현부 */

            val intent = Intent(this, UserInformation5Activity::class.java)
            finish()
            startActivity(intent)
        }
    }
}
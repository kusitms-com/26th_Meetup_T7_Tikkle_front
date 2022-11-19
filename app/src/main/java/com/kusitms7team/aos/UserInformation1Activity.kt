package com.kusitms7team.aos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class UserInformation1Activity : AppCompatActivity() {

    lateinit var btnBack : ImageButton
    lateinit var btnNext : ImageButton
    lateinit var enterNick : EditText
    lateinit var enterIntroduction : EditText
    lateinit var btnImg1 : ImageButton
    lateinit var btnImg2 : ImageButton
    lateinit var btnImg3 : ImageButton
    lateinit var btnImg4 : ImageButton
    lateinit var btnImg5 : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information1)

        enterNick = findViewById(R.id.enterNick)
        enterIntroduction = findViewById(R.id.enterIntroduction)

        btnImg1 = findViewById(R.id.btnImg1)
        btnImg2 = findViewById(R.id.btnImg2)
        btnImg3 = findViewById(R.id.btnImg3)
        btnImg4 = findViewById(R.id.btnImg4)
        btnImg5 = findViewById(R.id.btnImg5)
        var profileImg: MutableList<Int> = mutableListOf(0, 0, 0, 0, 0)

        btnImg1.setOnClickListener{
                btnImg1.setImageResource(R.drawable.ic_profile1_select)
                profileImg[0] = 1
        }

        btnImg2.setOnClickListener{
                btnImg2.setImageResource(R.drawable.ic_profile2_select)
                profileImg[1] = 1
        }

        btnImg3.setOnClickListener{
                btnImg3.setImageResource(R.drawable.ic_profile3_select)
                profileImg[2] = 1
        }

        btnImg4.setOnClickListener{
                btnImg4.setImageResource(R.drawable.ic_profile4_select)
                profileImg[3] = 1
        }

        btnImg5.setOnClickListener{
                btnImg5.setImageResource(R.drawable.ic_profile5_select)
                profileImg[4] = 1
        }

        /* 뒤로가기 버튼 클릭 리스너 */
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        /* 다음 페이지 버튼 클릭 리스너 */
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener{

            val nick = enterNick.text.toString()
            val introduction = enterIntroduction.text.toString()
            val profileImgList = profileImg.toString()

            /* 유저가 항목을 다 채우지 않았을 경우 */
            if (nick.length == 0 || introduction.length == 0 ) {
                Toast.makeText(this, "모든 정보를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, UserInformation2Activity::class.java)
                intent.putExtra("nick", nick)
                intent.putExtra("introduction", introduction)
                intent.putExtra("profileImgList", profileImgList)

                finish()
                startActivity(intent)
            }
        }
    }
}
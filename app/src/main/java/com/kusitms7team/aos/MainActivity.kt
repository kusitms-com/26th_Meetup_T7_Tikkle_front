package com.kusitms7team.aos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import android.view.WindowManager
import android.widget.Toast
import com.kusitms7team.aos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //Home Activity Navigation 초기화면 설정
        supportFragmentManager.beginTransaction().add(R.id.main_frm,
            HomeConsumptionReviewFragment()
        ).commit()

        //가운데버튼 클릭시 챌린지 인증
        binding.fab.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, ChallemgeProve1Fragment())
                .commitAllowingStateLoss()
        }

        //Home Activity Navigation
        binding.mainBnv.setOnItemSelectedListener{ item ->
            when (item.itemId) {

                R.id.homeFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeConsumptionReviewFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.feedFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, FeedFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.challengeFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, ChallengeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.mypageFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, MypageFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            true
        }
    }

    //로그인 후 뒤로가기 막기
    var time : Long = 0

    override fun onBackPressed() {

        if(System.currentTimeMillis()-time>=1500) {
            time=System.currentTimeMillis();
            Toast.makeText(getApplicationContext(),"뒤로 가기 버튼을 한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
        }
        else if(System.currentTimeMillis()-time<1500){ // 뒤로 가기 한번 더 눌렀을때의 시간간격 텀이 1초
            finishAffinity();
            System.runFinalization();
            System.exit(0);
        }
    }

}
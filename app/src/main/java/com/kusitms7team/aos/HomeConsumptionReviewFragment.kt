package com.kusitms7team.aos

import android.content.ContentValues.TAG
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kusitms7team.aos.databinding.FragmentHomeConsumptionReviewBinding
import java.text.SimpleDateFormat
import java.util.*

class HomeConsumptionReviewFragment : Fragment() {
    lateinit var binding: FragmentHomeConsumptionReviewBinding
    val cal = Calendar.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            com.kusitms7team.aos.R.layout.fragment_home_consumption_review,
            container,
            false
        )

        val today: String? = doDayOfWeek()

        return binding.root
    }


    private fun doDayOfWeek(): String? {

        val calendar = Calendar.getInstance()
        calendar.time = Date()

        // 오늘 날짜의 주 구하기
        val week_of_year = calendar.get(Calendar.WEEK_OF_YEAR)

        // 월요일
        calendar.add(Calendar.DAY_OF_MONTH, (2 - calendar.get(Calendar.DAY_OF_WEEK)))
        val mondayDate = calendar.time
        val monday = dateDay(mondayDate)

        // 화요일
        calendar.add(Calendar.DAY_OF_MONTH, (3 - calendar.get(Calendar.DAY_OF_WEEK)))
        val tuesdayDate = calendar.time
        val tuesday = dateDay(tuesdayDate)

        // 수요일
        calendar.add(Calendar.DAY_OF_MONTH, (4 - calendar.get(Calendar.DAY_OF_WEEK)))
        val wednesdayDate = calendar.time
        val wednesday = dateDay(wednesdayDate)

        // 목요일
        calendar.add(Calendar.DAY_OF_MONTH, (5 - calendar.get(Calendar.DAY_OF_WEEK)))
        val thursdayDate = calendar.time
        val thursday = dateDay(thursdayDate)

        // 금요일
        calendar.add(Calendar.DAY_OF_MONTH, (6 - calendar.get(Calendar.DAY_OF_WEEK)))
        val fridayDate = calendar.time
        val friday = dateDay(fridayDate)

        // 토요일
        calendar.add(Calendar.DAY_OF_MONTH, (7 - calendar.get(Calendar.DAY_OF_WEEK)))
        val saturdayDate = calendar.time
        val saturday = dateDay(saturdayDate)

        // 일요일
        calendar.add(Calendar.DAY_OF_MONTH, (8 - calendar.get(Calendar.DAY_OF_WEEK)))
        val sundayDate = calendar.time
        val sunday = dateDay(sundayDate)


        //calendar
        val year = cal.get(Calendar.YEAR).toString()
        val month = (cal.get(Calendar.MONTH) + 1).toString()
        val day = cal.get(Calendar.DATE).toString()
        Log.d(TAG, "DailyMenuActivity - onCreate is called ${year}-${month}-${day}")
        binding.textdate.setText(year + "년" + month + "월" + day + "일")
        binding.textdate1.setText(year + "년" + month + "월" + day + "일")


        var strWeek: String? = null
        val nWeek: Int = cal.get(Calendar.DAY_OF_WEEK)
        if (nWeek == 1) {
            strWeek = "일"
            binding.sun.setBackgroundColor(Color.parseColor("#F56508"))
            binding.textsun.setTextColor(Color.parseColor("#F56508"))
            binding.daysun.setTextColor(Color.parseColor("#F56508"))
        } else if (nWeek == 2) {
            strWeek = "월"
            binding.mon.setBackgroundColor(Color.parseColor("#F56508"))
            binding.textmon.setTextColor(Color.parseColor("#F56508"))
            binding.daymon.setTextColor(Color.parseColor("#F56508"))
        } else if (nWeek == 3) {
            strWeek = "화"
            binding.tue.setBackgroundColor(Color.parseColor("#F56508"))
            binding.texttue.setTextColor(Color.parseColor("#F56508"))
            binding.daytue.setTextColor(Color.parseColor("#F56508"))
        } else if (nWeek == 4) {
            strWeek = "수"
            binding.wed.setBackgroundColor(Color.parseColor("#F56508"))
            binding.textwed.setTextColor(Color.parseColor("#F56508"))
            binding.daywed.setTextColor(Color.parseColor("#F56508"))

        } else if (nWeek == 5) {
            strWeek = "목"
            binding.thu.setBackgroundColor(Color.parseColor("#F56508"))
            binding.textthu.setTextColor(Color.parseColor("#F56508"))
            binding.daythu.setTextColor(Color.parseColor("#F56508"))
        } else if (nWeek == 6
        ) {
            strWeek = "금"
            binding.fri.setBackgroundColor(Color.parseColor("#F56508"))
            binding.textfri.setTextColor(Color.parseColor("#F56508"))
            binding.dayfri.setTextColor(Color.parseColor("#F56508"))
        } else if (nWeek == 7) {
            strWeek = "토"
            binding.sat.setBackgroundColor(Color.parseColor("#F56508"))
            binding.textsat.setTextColor(Color.parseColor("#F56508"))
            binding.daysat.setTextColor(Color.parseColor("#F56508"))
        }

        binding.daymon.setText(monday)
        binding.daytue.setText(tuesday)
        binding.daywed.setText(wednesday)
        binding.daythu.setText(thursday)
        binding.dayfri.setText(friday)
        binding.daysat.setText(saturday)
        binding.daysun.setText(sunday)

        return strWeek
    }

    fun dateDay(date: Date): String {
        val dayFormat = SimpleDateFormat("MM/dd", Locale.getDefault())
        val day = dayFormat.format(date)
        return day
    }
}


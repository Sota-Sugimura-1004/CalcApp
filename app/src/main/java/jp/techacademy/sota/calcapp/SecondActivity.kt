package jp.techacademy.sota.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value0 = intent.getIntExtra("SYMBOL", 0)
        val value1 = intent.getFloatExtra("VALUE1", 0F)
        val value2 = intent.getFloatExtra("VALUE2",0F)

        when{
            value0 == 1 -> textView.text = "${value1 + value2}"
            value0 == 2 -> textView.text = "${value1 - value2}"
            value0 == 3 -> textView.text = "${value1 * value2}"
            value0 == 4 -> textView.text = "${value1 / value2}"
        }

    }

}
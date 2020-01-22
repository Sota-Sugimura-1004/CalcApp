package jp.techacademy.sota.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        var value0 = 0
        when(v.id){
            R.id.button1 -> value0 = 1
            R.id.button2 -> value0 = 2
            R.id.button3 -> value0 = 3
            R.id.button4 -> value0 = 4
        }

        if(editText1.text.toString().length != 0 && editText2.text.toString().length != 0) {
            val value1 = (editText1.text.toString()).toFloat()
            val value2 = (editText2.text.toString()).toFloat()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("SYMBOL", value0)
            intent.putExtra("VALUE1", value1)
            intent.putExtra("VALUE2", value2)
            startActivity(intent)
        }
    }
}
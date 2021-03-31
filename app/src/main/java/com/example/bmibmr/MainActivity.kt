package com.example.bmibmr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast1 = Toast.makeText(applicationContext, "กรุณาใส่น้ำหนัก", Toast.LENGTH_LONG)
        val toast2 = Toast.makeText(applicationContext, "กรุณาใส่ส่วนสูง", Toast.LENGTH_LONG)
        var a = 0
        var b = 0
        var sum = 0

        cal.setOnClickListener {
            if (this.num1.text.toString() == "" && this.num2.text.toString() == "") {
                toast1.show()
            }else if (this.num2.text.toString()=="") {
                toast2.show()
            }else{
                g.setText("/")
                var a=this.num1.text.toString().toDouble()
                var b=this.num2.text.toString().toDouble()
                sum=num1*(num2/num2)
                result.setText("$sum")
            }
        }
    }
}
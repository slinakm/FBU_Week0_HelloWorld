package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.colorPrimaryDark))
            }
        })

        findViewById<Button>(R.id.button_background).setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                findViewById<RelativeLayout>(R.id.rootView).setBackgroundColor(
                    resources.getColor(R.color.colorBackground))
            }
        })

        findViewById<Button>(R.id.button_text).setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val inputString: String = findViewById<EditText>(R.id.editText).text.toString()
                if (TextUtils.isEmpty(inputString)) {
                    findViewById<TextView>(R.id.textView).text = getString(R.string.hello_from_selina)
                } else {
                    findViewById<TextView>(R.id.textView).text = inputString
                }
                //getString(R.string.android_is_awesome)
            }
        })

        findViewById<RelativeLayout>(R.id.rootView).setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.colorString))
                findViewById<RelativeLayout>(R.id.rootView).setBackgroundColor(
                    resources.getColor(R.color.colorPrimary))
                findViewById<TextView>(R.id.textView).text = getString(R.string.hello_from_selina)

            }
        })
    }
}
package iwabuchi.naoki.techacademy.kotlina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android. util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = 10
        Log.d("kotlintest", Integer.toString(num))
        num = 50
        Log.d("kotlintest", num.toString())
    }
}

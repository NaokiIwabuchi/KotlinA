package iwabuchi.naoki.techacademy.kotlina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android. util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lmb ={x: Int, y:Int -> x+y}
        val z= lmb(100,200)
        Log.d("kotlintest", z.toString())
    }


    }









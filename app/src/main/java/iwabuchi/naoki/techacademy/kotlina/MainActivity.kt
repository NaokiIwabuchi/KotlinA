package iwabuchi.naoki.techacademy.kotlina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android. util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        total()
    }

    private fun total() {
        var sum = 0
        for (i in 1..10) {
            sum += i
        }

        Log.d("kotlintest", sum.toString())

    }
}







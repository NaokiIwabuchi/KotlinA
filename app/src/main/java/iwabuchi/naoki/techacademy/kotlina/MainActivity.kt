package iwabuchi.naoki.techacademy.kotlina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android. util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        total(50,100)
    }

    private fun total(first: Int,last: Int) {
        var sum = 0
        for (i in first..last) {
            sum += i
        }

        Log.d("kotlintest", sum.toString())

    }
}







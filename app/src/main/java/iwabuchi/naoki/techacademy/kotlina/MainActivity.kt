package iwabuchi.naoki.techacademy.kotlina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android. util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = 100
        val num2 = 0
        var ans = 0

        try {
            ans = num1 / num2
        } catch (e: Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            Log.d("kotlintest", e.message)
        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())

        }
    }
}





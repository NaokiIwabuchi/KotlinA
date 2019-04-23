package iwabuchi.naoki.techacademy.kotlina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android. util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1 ..3) {
            Log.d("kotlintest", "演算子の" + i + "回目")
        }
        //12から3つ飛ばし
        for (i in 12 downTo 0 step 3)
            Log.d("kotlintest", "downTo関数の" + i + "回目")

        }
    }




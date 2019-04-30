package iwabuchi.naoki.techacademy.kotlina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android. util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human("由美" ,23,  "映画鑑賞")
        human.say()
        human.think()

        val human2 = Human("直樹",25,  "読書")
        human2.say()
        human2.think()


    }

    }





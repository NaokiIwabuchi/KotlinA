package iwabuchi.naoki.techacademy.kotlina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android. util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dog = Dog("ポチ",3)
        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name  + "です")
        Log.d("kotlintest", "犬の年齢は" + dog.age  + "です")

        val dog2 = Dog("しろ",10)
        dog2.say()
        Log.d("kotlintest", "犬の名前は" + dog2.name  + "です")
        Log.d("kotlintest", "犬の年齢は" + dog2.age  + "です")

    }

    }









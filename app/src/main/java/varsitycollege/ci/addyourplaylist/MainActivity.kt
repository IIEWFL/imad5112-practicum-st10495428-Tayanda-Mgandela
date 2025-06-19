package varsitycollege.ci.addyourplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var welcomeText =findViewById<TextView>(R.id.WelcomeText)
    var Startbtn = findViewById<Button>(R.id.Startbtn)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        welcomeText = findViewById(R.id.WelcomeText)
        Startbtn = findViewById(R.id.Startbtn)

        Startbtn.setOnClickListener(){
            val intent = Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }

    }

}
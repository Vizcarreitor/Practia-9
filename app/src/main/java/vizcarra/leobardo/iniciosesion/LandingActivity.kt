package vizcarra.leobardo.iniciosesion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val bundle = intent.extras
        var nameTxt: TextView = findViewById(R.id.tv_name)
        var emailTxt: TextView = findViewById(R.id.tv_email)

        if (bundle != null) {
            val name = bundle.getString("name")
            val email = bundle.getString("email")

            nameTxt.text = name
            emailTxt.text = email
        }

        var btn_cerrar: Button = findViewById(R.id.btn_cerrar)
        btn_cerrar.setOnClickListener {
            finish()
        }

    }

}
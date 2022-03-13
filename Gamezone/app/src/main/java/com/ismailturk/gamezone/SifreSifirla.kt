package com.ismailturk.gamezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sifre_sifirla.*

class SifreSifirla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sifre_sifirla)


        gonderBtn.setOnClickListener {
            val email: String =emailSifirla.text.toString().trim { it <= ' '}
            if(email.isEmpty()){
                Toast.makeText(this@SifreSifirla,"E-mail alanı boş bırakılamaz!",Toast.LENGTH_SHORT).show()
            }else{
                FirebaseAuth.getInstance().sendPasswordResetEmail(email).addOnCompleteListener{ task ->
                    if(task.isSuccessful){
                        Toast.makeText(this@SifreSifirla,"Şifrenizi değiştirmek için mail yollandı!",Toast.LENGTH_LONG).show()
                        val intent= Intent(applicationContext,MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }else{
                        Toast.makeText(this@SifreSifirla,task.exception!!.message.toString(),Toast.LENGTH_LONG).show()

                    }
                }
            }
        }
    }
}
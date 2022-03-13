package com.ismailturk.gamezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_giris.*

class GirisActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris)

        devamEtButton.setOnClickListener {
            when{
                TextUtils.isEmpty(emailGirTextView.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(this@GirisActivity,"Lütfen email adresinizi giriniz", Toast.LENGTH_SHORT).show()
                }

                TextUtils.isEmpty(sifreGirTextView.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(this@GirisActivity,"Lütfen sifrenizi giriniz", Toast.LENGTH_SHORT).show()
                }
                else ->{
                    val email:String=emailGirTextView.text.toString().trim { it <= ' ' }
                    val password:String=sifreGirTextView.text.toString().trim { it <= ' ' }
                    FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password).addOnCompleteListener(
                        OnCompleteListener<AuthResult>{ task ->
                            if (task.isSuccessful){
                                Toast.makeText(this@GirisActivity,"Giriş Basarili!",Toast.LENGTH_SHORT).show()
                                val intent=Intent(applicationContext,LoadingScreen::class.java)
                                intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                intent.putExtra("user_id",FirebaseAuth.getInstance().currentUser!!.uid)
                                intent.putExtra("email_id",email)
                                startActivity(intent)
                                finish()

                            }else{
                                Toast.makeText(this@GirisActivity,task.exception!!.message.toString(), Toast.LENGTH_SHORT).show()
                            }
                        }
                    )
                }
            }
        }
    }
    fun sifreUnuttum(view : View){
        val intent = Intent(this, SifreSifirla::class.java)
        startActivity(intent)
    }
}





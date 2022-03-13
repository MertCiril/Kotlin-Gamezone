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
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.FirebaseAuthKtxRegistrar
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_kayit.*

class KayitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayit)

        //FIREBASE BAGLAMA

        kaydetButton.setOnClickListener {
            when{
                TextUtils.isEmpty(emailGirTextView.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(this@KayitActivity,"Lütfen e-mailinizi giriniz!",Toast.LENGTH_SHORT).show()
                }

                TextUtils.isEmpty(sifreGirTextView.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(this@KayitActivity,"Lütfen sifrenizi giriniz!",Toast.LENGTH_SHORT).show()
                }
                sifreGirTextView.text.toString()!= sifreGirTextView2.text.toString() ->{
                    Toast.makeText(this@KayitActivity,"Şifreler eşleşmiyor!",Toast.LENGTH_SHORT).show()
                }
                sifreGirTextView.text.toString().length<8->{
                    Toast.makeText(this@KayitActivity,"Şifreniz minimum 8 karakter olmak zorundadır!",Toast.LENGTH_SHORT).show()
                }
                else ->{
                    val email:String=emailGirTextView.text.toString().trim { it <= ' ' }
                    val password:String=sifreGirTextView.text.toString().trim { it <= ' ' }
                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password).addOnCompleteListener(//kalıp kod
                            OnCompleteListener<AuthResult>{ task ->
                            if (task.isSuccessful){
                                val firebaseUser: FirebaseUser =task.result!!.user!!

                                Toast.makeText(this@KayitActivity,"Kayit Basarili!!",Toast.LENGTH_SHORT
                                ).show()
                                val intent=Intent(this@KayitActivity,GirisActivity::class.java)
                                intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                intent.putExtra("user_id",firebaseUser.uid)
                                intent.putExtra("email_id",email)
                                startActivity(intent)
                                finish()
                            }else{
                                Toast.makeText(this@KayitActivity,task.exception!!.message.toString(),Toast.LENGTH_SHORT).show()
                            }
                        }
                    )

                }
            }
        }
        geriKayitButton.setOnClickListener{
            val intent=Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            onDestroy()
        }

    }
}
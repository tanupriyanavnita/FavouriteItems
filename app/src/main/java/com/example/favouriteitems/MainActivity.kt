package com.example.favouriteitems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
data class Student(val name:String,val pwd:String)
class MainActivity : AppCompatActivity() {
    lateinit var name:String //used lateinit to make compiler that these values are not null and will be initialized before use
    lateinit var pwd:String
    private lateinit var st: Student
    val s1=Student("Tanu","Tanu@1234") //here I have hardcoded the names and passwords
    val s2=Student("Akanksha","Akanksha@1234")
    val s3=Student("Nikita","Nikki@1234")
    val s4=Student("Navnita","Nav@1234")
    val s5=Student("Prithvi","Prithvi@1234")
    val items= listOf<Student>(s1,s2,s3,s4,s5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton: Button = findViewById(R.id.button)
        val uid: EditText = findViewById(R.id.uname)
        val pass: EditText = findViewById(R.id.pwd)
        loginButton.setOnClickListener {
            name=uid.text.toString()
            pwd=pass.text.toString()
            st=Student(name,pwd)
            check(st)
        }
    }
    fun check(st:Student):Unit{
        var c=0
        for ( i in items)
        {
            if(i==st)
            {
                c=1
                break
            }
        }
        if(c==0)
            Toast.makeText(this,"Invalid Login id or password", Toast.LENGTH_SHORT).show()
        else
        {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CartoonActivity::class.java)
            startActivity(intent)
        }
    }

}



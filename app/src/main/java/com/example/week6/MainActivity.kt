package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var flag=true;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)

        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.music){
            if(flag){
                item.setIcon(R.drawable.ic_action_musicon)
                flag=false
            }
            else{
                item.setIcon(R.drawable.ic_action_name)
                flag=true
            }

        }

        return true;
    }
    fun Onmusic(view: View){

        val img:ImageView=findViewById(R.id.img)

    }
    fun read(view: View){
        val sn:Scanner= Scanner(resources.openRawResource(R.raw.file))
        var str=""
        while (sn.hasNext()){
            str+=sn.hasNextLine()
        }
        val txt:TextView=findViewById(R.id.textView)
        txt.setText(str)
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}
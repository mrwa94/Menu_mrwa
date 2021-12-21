package com.example.menu_mrwa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.pages_menu, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> startActivity(Intent(this, homeActivity::class.java))
            R.id.about -> startActivity(Intent(this, AboutActivity::class.java))
            R.id.help -> startActivity(Intent(this, HelpActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}
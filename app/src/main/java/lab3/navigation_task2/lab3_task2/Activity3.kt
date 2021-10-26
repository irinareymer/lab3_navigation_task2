package lab3.navigation_task2.lab3_task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import lab3.navigation_task2.lab3_task2.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonBackActivity1.setOnClickListener{
            setResult(1)
            finish()
        }
        binding.buttonBackActivity2.setOnClickListener{
            setResult(2)
            finish()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.app_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.about) {
            val intent = Intent(this, ActivityAbout::class.java)
            startActivity(intent)
            true
        }
        else super.onOptionsItemSelected(item)
    }
}
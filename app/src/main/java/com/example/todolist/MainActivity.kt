package com.example.todolist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todolist.ui.theme.ToDoListTheme

private fun <E> MutableList<E>.add(element: String) {
    TODO("Not yet implemented")
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)

        val tasks = mutableListOf(String)

        val button: Button = findViewById(R.id.button)
        val input: EditText = findViewById(R.id.input)
        val checkedTextView: TextView = findViewById(R.id.checkedTextView)

        button.setOnClickListener {
            tasks.add(input.text.toString())
            input.text.clear()
            checkedTextView.text = tasks.joinToString("\n")

        }
    }
}



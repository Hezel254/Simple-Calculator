package com.example.simplecalculator

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var button_div: Button
    lateinit var button_mult: Button
    lateinit var button_add: Button
    lateinit var button_sub: Button
    lateinit var button_7: Button
    lateinit var button_8: Button
    lateinit var button_9: Button
    lateinit var button_Del: Button
    lateinit var button_4: Button
    lateinit var button_5: Button
    lateinit var button_6: Button
    lateinit var button_equal: Button
    lateinit var button_1: Button
    lateinit var button_2: Button
    lateinit var button_3: Button
    lateinit var button_open_bracket: Button
    lateinit var button_closing_bracket: Button
    lateinit var button_percent: Button
    lateinit var button_0: Button
    lateinit var button_dot: Button
    lateinit var editText: EditText
    lateinit var current: String
    lateinit var new: String
    lateinit var action: String
    var num1 = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_div = findViewById(R.id.button_division)
        button_mult = findViewById(R.id.button_multiplication)
        button_add = findViewById(R.id.button_addition)
        button_sub = findViewById(R.id.button_subtraction)
        button_7 = findViewById(R.id.button_7)
        button_8 = findViewById(R.id.button_8)
        button_9 = findViewById(R.id.button_9)
        button_Del = findViewById(R.id.button_delete)
        button_4 = findViewById(R.id.button_4)
        button_5 = findViewById(R.id.button_5)
        button_6 = findViewById(R.id.button_6)
        button_equal = findViewById(R.id.button_equals)
        button_1 = findViewById(R.id.button_1)
        button_2 = findViewById(R.id.button_2)
        button_3 = findViewById(R.id.button_3)
        button_open_bracket = findViewById(R.id.button_open_bracket)
        button_closing_bracket = findViewById(R.id.button_closing_bracket)
        button_percent = findViewById(R.id.button_percent)
        button_0 = findViewById(R.id.button_0)
        button_dot = findViewById(R.id.button_dot)
        editText = findViewById(R.id.editText)

        buttonsClick()

        button_div.setOnClickListener {

            if (TextUtils.isEmpty(editText.text.toString())) {

            } else {
                num1 = editText.text.toString().toDouble()
                editText.text.clear()
                action = "div"

            }
        }

        button_add.setOnClickListener {

            if (TextUtils.isEmpty(editText.text.toString())) {

                //if edittext is empty do nothing
            } else {
                //if edittext has a value check for ( or )
                if (editText.text.toString().contains("(")){
                    //if edittext has ( remove it and assign the value to num 1
                  val edited=  editText.text.toString().replace("(","")
                    num1 = edited.toDouble()
                    editText.text.clear()
                    action = "add"
                }else if (editText.text.toString().contains(")")){
                    //if edittext has ) remove it and assign the value to num 1
                    val edited=  editText.text.toString().replace(")","")
                    num1 = edited.toDouble()
                    editText.text.clear()
                    action = "add"
                }else{
                    //if edittext doesn't have  ( )
                    num1 = editText.text.toString().toDouble()
                    editText.text.clear()
                    action = "add"
                }
            }

        }
        button_mult.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {

            } else {
                if (editText.text.toString().contains("(")){
                    val edited=editText.text.toString().replace("(", "")
                    num1= edited.toDouble()
                    editText.text.clear()
                    action="multiplication"
                }
                else if(editText.text.toString().contains(")")){
                    val edited= editText.text.toString().replace(")","")
                    num1=edited.toDouble()
                    editText.text.clear()
                    action="multiplication"

                }
                else{

                num1 = editText.text.toString().toDouble()
                editText.text.clear()
                action = "multiplication"
                    }
            }
        }
        button_div.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {

            } else {
                if (editText.text.toString().contains("(")){
                    val edited=editText.text.toString().replace("(", "")
                    num1= edited.toDouble()
                    editText.text.clear()
                    action="div"
                }
                else if(editText.text.toString().contains(")")){
                    val edited= editText.text.toString().replace(")","")
                    num1=edited.toDouble()
                    editText.text.clear()
                    action="div"

                }
                else{

                    num1 = editText.text.toString().toDouble()
                    editText.text.clear()
                    action = "div"
                }
            }
        }
        button_add.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {

            } else {
                if (editText.text.toString().contains("(")){
                    val edited=editText.text.toString().replace("(", "")
                    num1= edited.toDouble()
                    editText.text.clear()
                    action="add"
                }
                else if(editText.text.toString().contains(")")){
                    val edited= editText.text.toString().replace(")","")
                    num1=edited.toDouble()
                    editText.text.clear()
                    action="add"

                }
                else{

                    num1 = editText.text.toString().toDouble()
                    editText.text.clear()
                    action = "add"
                }
            }
        }
        button_sub.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {

            } else {
                if (editText.text.toString().contains("(")){
                    val edited=editText.text.toString().replace("(", "")
                    num1= edited.toDouble()
                    editText.text.clear()
                    action="subtraction"
                }
                else if(editText.text.toString().contains(")")){
                    val edited= editText.text.toString().replace(")","")
                    num1=edited.toDouble()
                    editText.text.clear()
                    action="subtraction"

                }
                else{

                    num1 = editText.text.toString().toDouble()
                    editText.text.clear()
                    action = "subtraction"
                }
            }
        }
        button_percent.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {

            } else {
                num1 = editText.text.toString().toDouble()
                editText.text.clear()
                action = "percent"
            }
        }


        button_equal.setOnClickListener {
            //editText.text.clear()
            if (editText.text.toString().contains("(")){
                val edited2=editText.text.toString().replace("(","")
                if (action.equals("div")) {
                    val num2 =edited2.toDouble()
                    divide(num1, num2)
                } else if (action.equals("multiplication")) {
                    val num2 = edited2.toDouble()
                    mult(num1, num2)
                } else if (action.equals("subtraction")) {
                    val num2 = edited2.toDouble()
                    subtraction(num1, num2)
                } else if (action.equals("add")) {
                    val num2 = edited2.toDouble()
                    add(num1, num2)
                } else if (action.equals("percent")) {
                    percent(num1)
                }
            }else if (editText.text.toString().contains(")")){
                val edited2=editText.text.toString().replace(")","")
                if (action.equals("div")) {
                    val num2 = edited2.toDouble()
                    divide(num1, num2)
                } else if (action.equals("multiplication")) {
                    val num2 = edited2.toDouble()
                    mult(num1, num2)
                } else if (action.equals("subtraction")) {
                    val num2 = edited2.toDouble()
                    subtraction(num1, num2)
                } else if (action.equals("add")) {
                    val num2 = edited2.toDouble()
                    add(num1, num2)
                } else if (action.equals("percent")) {
                    num1=edited2.toDouble()
                    percent(num1)
                }
            }else{
                if (action.equals("div")) {
                    val num2 = editText.text.toString().toDouble()
                    divide(num1, num2)
                } else if (action.equals("multiplication")) {
                    val num2 = editText.text.toString().toDouble()
                    mult(num1, num2)
                } else if (action.equals("subtraction")) {
                    val num2 = editText.text.toString().toDouble()
                    subtraction(num1, num2)
                } else if (action.equals("add")) {
                    val num2 = editText.text.toString().toDouble()
                    add(num1, num2)
                } else if (action.equals("percent")) {
                    percent(num1)
                }
            }


        }

        button_dot.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("0.")
            } else {
                current = editText.text.toString()
                new = current + "."
                editText.setText(new)
            }
        }

    }

    //numbers buttons
    fun buttonsClick() {

        button_0.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("0")
            } else {
                current = editText.text.toString()
                new = current + "0"
                editText.setText(new)
            }
        }

        button_1.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("1")
            } else {
                current = editText.text.toString()
                new = current + "1"
                editText.setText(new)
            }
        }
        button_2.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("2")
            } else {
                current = editText.text.toString()
                new = current + "2"
                editText.setText(new)
            }
        }
        button_3.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("3")
            } else {
                current = editText.text.toString()
                new = current + "3"
                editText.setText(new)
            }
        }
        button_4.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("4")
            } else {
                current = editText.text.toString()
                new = current + "4"
                editText.setText(new)
            }
        }
        button_5.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("5")
            } else {
                current = editText.text.toString()
                new = current + "5"
                editText.setText(new)
            }
        }
        button_6.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("6")
            } else {
                current = editText.text.toString()
                new = current + "6"
                editText.setText(new)
            }
        }
        button_7.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("7")
            } else {
                current = editText.text.toString()
                new = current + "7"
                editText.setText(new)
            }
        }
        button_8.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("8")
            } else {
                current = editText.text.toString()
                new = current + "8"
                editText.setText(new)
            }
        }
        button_9.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("9")
            } else {
                current = editText.text.toString()
                new = current + "9"
                editText.setText(new)
            }
        }

        button_Del.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {

            } else {
                current = editText.text.toString()
                new = current.dropLast(1)
                editText.setText(new)
            }
        }

        button_Del.setOnLongClickListener {
            editText.text.clear()
            true
        }

        button_open_bracket.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {
                editText.setText("(")
            } else {
                current = editText.text.toString()
                new = current + "("
                editText.setText(new)
            }
        }

        button_closing_bracket.setOnClickListener {
            if (TextUtils.isEmpty(editText.text.toString())) {

            } else {
                current = editText.text.toString()
                new = current + ")"
                editText.setText(new)
            }
        }
    }

    //actions
    fun divide(num1: Double, num2: Double) {
        val ans = num1 / num2
        editText.setText(ans.toString())
    }

    fun mult(num1: Double, num2: Double) {
        val ans = num1 * num2
        editText.setText(ans.toString())

    }

    fun add(num1: Double, num2: Double) {
        val ans = num1 + num2
        editText.setText(ans.toString())
    }

    fun subtraction(num1: Double, num2: Double) {
        val ans = num1 - num2
        editText.setText(ans.toString())
    }

    fun percent(num1: Double) {
        val ans = (num1.toDouble()) / 100
        editText.setText(ans.toString())
    }
}
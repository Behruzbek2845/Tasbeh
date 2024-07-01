package com.example.tasbeh.sharedPraferance

import android.content.Context
import android.content.SharedPreferences
import com.example.tasbeh.models.Sana
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPraferance {
    private const val NAME = "todo"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var list:ArrayList<Sana>
        get() = jsonStringToList(preferences.getString("list", "[]")!!)
        set(value) = preferences.edit {
            it.putString("list", listToJsonString(value))
        }

    private fun listToJsonString(arrayList: ArrayList<Sana>): String {
        return Gson().toJson(arrayList)
    }

    private fun jsonStringToList(gsonString: String): ArrayList<Sana> {
        val typeToken = object : TypeToken<ArrayList<Sana>>() {}.type
        return Gson().fromJson(gsonString, typeToken)
    }
}
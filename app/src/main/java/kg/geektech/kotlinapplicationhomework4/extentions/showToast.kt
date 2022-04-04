package kg.geektech.kotlinapplicationhomework4.extentions

import android.content.Context
import android.widget.Toast
import com.google.android.material.tabs.TabLayout

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.showToastAdapter(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

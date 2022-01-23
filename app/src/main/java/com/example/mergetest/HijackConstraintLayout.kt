package com.example.mergetest

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class HijackConstraintLayout: ConstraintLayout {
    constructor(context: Context): super(context)
    constructor(context: Context, attributeSet: AttributeSet?): super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet?, i: Int): super(context, attributeSet, i)
    constructor(context: Context, attributeSet: AttributeSet?, i: Int, i2: Int): super(context, attributeSet, i, i2)

    override fun onViewAdded(view: View?) {
        super.onViewAdded(view)

        this.post {
            findViewById<TextView>(R.id.textview3).text =
                "Hijacked textview3 from hosted application"
        }
    }
}
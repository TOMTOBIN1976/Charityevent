package org.wit.charityevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import timber.log.Timber.i


class CharityplacemarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charityplacemark)

        Timber.plant(Timber.DebugTree())

        i("Charity Events Activity started...")
    }
}
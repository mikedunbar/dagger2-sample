package com.mike.dagger2.ui.feature2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.mike.dagger2.R
import com.mike.dagger2.ui.App
import com.mike.dagger2.ui.feature1.FeatureOneMainScreen
import com.mike.dagger2.utils.FeatureTwoMainScreenUtils
import com.mike.dagger2.utils.FeatureTwoUtils
import com.mike.dagger2.utils.RestUtils
import com.mike.dagger2.utils.StringUtils
import javax.inject.Inject

class FeatureTwoMainScreen : AppCompatActivity() {

    @Inject
    lateinit var restUtils: RestUtils

    @Inject
    lateinit var stringUtils: StringUtils

    @Inject
    lateinit var featureTwoUtils: FeatureTwoUtils

    @Inject
    lateinit var featureTwoMainScreenUtils: FeatureTwoMainScreenUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature2_activity_main)
        App.featureTwoMainScreenComponent.inject(this)

        val textView = findViewById<TextView>(R.id.producerText)
        textView.text = getDisplayString()

        val secondaryScreenButton = findViewById<Button>(R.id.secondary_screen_button)
        secondaryScreenButton.setOnClickListener{
            startActivity(Intent(this, FeatureTwoSecondaryScreen::class.java))
        }

        val featureOneScreenButton = findViewById<Button>(R.id.feature_1_button)
        featureOneScreenButton.setOnClickListener {
            startActivity(Intent(this, FeatureOneMainScreen::class.java))
        }
    }

    private fun getDisplayString() =
            "restUtils: ${restUtils.getDebugString()}\n" +
            "stringUtils: ${stringUtils.getDebugString()}\n" +
            "featureTwoUtils: ${featureTwoUtils.getDebugString()} \n" +
            "featureTwoSecondaryUtils: ${featureTwoMainScreenUtils.getDebugString()}"
}

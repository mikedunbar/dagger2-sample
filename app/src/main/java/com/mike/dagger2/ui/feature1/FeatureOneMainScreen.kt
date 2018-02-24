package com.mike.dagger2.ui.feature1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.mike.dagger2.R
import com.mike.dagger2.ui.App
import com.mike.dagger2.ui.feature2.FeatureTwoMainScreen
import com.mike.dagger2.utils.FeatureOneMainScreenUtils
import com.mike.dagger2.utils.FeatureOneUtils
import com.mike.dagger2.utils.RestUtils
import com.mike.dagger2.utils.StringUtils
import javax.inject.Inject

class FeatureOneMainScreen : AppCompatActivity() {

    @Inject
    lateinit var restUtils: RestUtils

    @Inject
    lateinit var stringUtils: StringUtils

    @Inject
    lateinit var featureOneUtils: FeatureOneUtils

    @Inject
    lateinit var featureOneMainScreenUtils: FeatureOneMainScreenUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature1_activity_main)
        App.featureOneMainScreenComponent.inject(this)

        val textView = findViewById<TextView>(R.id.producerText)
        textView.text = getDisplayString()

        val secondaryScreenButton = findViewById<Button>(R.id.secondary_screen_button)
        secondaryScreenButton.setOnClickListener({
            startActivity(Intent(this, FeatureOneSecondaryScreen::class.java))
        })

        val featureTwoButton = findViewById<Button>(R.id.feature_2_button)
        featureTwoButton.setOnClickListener({
            startActivity(Intent(this, FeatureTwoMainScreen::class.java))
        })
    }

    private fun getDisplayString() =
            "restUtils: ${restUtils.getDebugString()} \n" +
            "stringUtils: ${stringUtils.getDebugString()}\n" +
            "featureOneUtils: ${featureOneUtils.getDebugString()}\n" +
            "featureOneMainUtils: ${featureOneMainScreenUtils.getDebugString()}"
}

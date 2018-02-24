package com.mike.dagger2.ui.feature1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mike.dagger2.R
import com.mike.dagger2.ui.App
import com.mike.dagger2.utils.FeatureOneSecondaryScreenUtils
import com.mike.dagger2.utils.FeatureOneUtils
import com.mike.dagger2.utils.RestUtils
import com.mike.dagger2.utils.StringUtils
import javax.inject.Inject

class FeatureOneSecondaryScreen : AppCompatActivity() {

    @Inject
    lateinit var restUtils: RestUtils

    @Inject
    lateinit var stringUtils: StringUtils

    @Inject
    lateinit var featureOneUtils: FeatureOneUtils

    @Inject
    lateinit var featureOneSecondaryScreenUtils: FeatureOneSecondaryScreenUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature1_activity_secondary)
        App.featureOneSecondaryScreenComponent.inject(this)

        val textView = findViewById<TextView>(R.id.producerText)
        textView.text = getDisplayString()
    }

    private fun getDisplayString() =
            "restUtils: ${restUtils.getDebugString()}\n" +
            "stringUtils: ${stringUtils.getDebugString()}\n" +
            "featureOneUtils: ${featureOneUtils.getDebugString()} \n" +
            "featureOneSecondaryUtils: ${featureOneSecondaryScreenUtils.getDebugString()}"
}

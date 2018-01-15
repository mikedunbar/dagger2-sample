package com.mike.dagger2.ui.feature2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.mike.dagger2.R
import com.mike.dagger2.ui.App
import com.mike.dagger2.utils.FeatureTwoSecondaryScreenUtils
import com.mike.dagger2.utils.FeatureTwoUtils
import com.mike.dagger2.utils.RestUtils
import com.mike.dagger2.utils.StringUtils
import javax.inject.Inject

class FeatureTwoSecondaryScreen : AppCompatActivity() {

    @Inject
    lateinit var restUtils: RestUtils

    @Inject
    lateinit var stringUtils: StringUtils

    @Inject
    lateinit var featureTwoUtils: FeatureTwoUtils

    @Inject
    lateinit var featureTwoSecondaryScreenUtils: FeatureTwoSecondaryScreenUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature2_activity_secondary)
        App.featureTwoSecondaryScreenComponent.inject(this)

        val textView = findViewById<TextView>(R.id.text)
        textView.text = getDisplayString()
    }

    private fun getDisplayString() =
            "restUtils: ${restUtils.getDebugString()}\n" +
            "stringUtils: ${stringUtils.getDebugString()}\n" +
            "featureOneUtils: ${featureTwoUtils.getDebugString()} \n" +
            "featureOneSecondaryUtils: ${featureTwoSecondaryScreenUtils.getDebugString()}"
}

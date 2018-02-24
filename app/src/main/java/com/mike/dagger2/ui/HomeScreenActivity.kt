package com.mike.dagger2.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.common.util.concurrent.FutureCallback
import com.google.common.util.concurrent.Futures
import com.mike.dagger2.R
import com.mike.dagger2.ui.feature1.FeatureOneMainScreen
import com.mike.dagger2.ui.feature2.FeatureTwoMainScreen
import com.mike.dagger2.utils.AsyncInitUtil
import io.reactivex.Observable
import java.util.concurrent.Executors
import javax.inject.Inject

class HomeScreenActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "HomeScreenActivity"
    }
    private val utilFuture = App.appAsyncProductionComponent.getAsynchInitUtil()

    @Inject lateinit var utilObservable: Observable<AsyncInitUtil>

    private lateinit var producerText: TextView
    private lateinit var observableText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen_activity_main)
        App.appAsyncDaggerComponent.inject(this)

        producerText = findViewById(R.id.producerText)
        producerText.text = "Producer initial text"

        observableText = findViewById(R.id.observableText)
        observableText.text = "Observable initial text"

        val featureOneScreenButton = findViewById<Button>(R.id.feature_1_button)
        featureOneScreenButton.setOnClickListener {
            startActivity(Intent(this, FeatureOneMainScreen::class.java))
        }

        val featureTwoScreenButton = findViewById<Button>(R.id.feature_2_button)
        featureTwoScreenButton.setOnClickListener{
            startActivity(Intent(this, FeatureTwoMainScreen::class.java))
        }
    }

    override fun onResume() {
        Log.d(TAG, "onResume called")
        super.onResume()
        updateProducerTextWhenUtilInitialized()
        updateObservableTextWhenUtilInitialized()
    }

    private fun updateProducerTextWhenUtilInitialized() {
        Log.d(TAG, "updateProducerTextWhenUtilInitialized called")
        Futures.addCallback(utilFuture, object : FutureCallback<AsyncInitUtil> {
            override fun onSuccess(result: AsyncInitUtil?) {
                runOnUiThread { producerText.text = "Producer util successfully initialized: ${result?.doThing()}"}
            }

            override fun onFailure(t: Throwable?) {
               runOnUiThread { producerText.text = "Producer util error initializing: ${t?.message}" }
            }
        }, Executors.newSingleThreadExecutor())
    }

    private fun updateObservableTextWhenUtilInitialized() {
        Log.d(TAG, "updateObservableTextWhenUtilInitialized called")
        utilObservable.subscribe(
                {observableText.text = "Observable util successfully initialized: ${it.doThing()}"},
                {observableText.text = "Observable util error initializing: ${it.message}"}
        )
    }
}

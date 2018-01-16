package com.mike.dagger2.ui

import android.app.Application
import com.mike.dagger2.di.AppComponent
import com.mike.dagger2.di.AppModule
import com.mike.dagger2.di.DaggerAppComponent
import com.mike.dagger2.di.UtilsModule
import com.mike.dagger2.di.feature1.FeatureOneComponent
import com.mike.dagger2.di.feature1.FeatureOneMainScreenComponent
import com.mike.dagger2.di.feature1.FeatureOneMainScreenModule
import com.mike.dagger2.di.feature1.FeatureOneModule
import com.mike.dagger2.di.feature1.FeatureOneSecondaryScreenComponent
import com.mike.dagger2.di.feature1.FeatureOneSecondaryScreenModule
import com.mike.dagger2.di.feature1.FeatureTwoComponent
import com.mike.dagger2.di.feature1.FeatureTwoMainScreenComponent
import com.mike.dagger2.di.feature1.FeatureTwoSecondaryScreenComponent
import com.mike.dagger2.di.feature2.FeatureTwoMainScreenModule
import com.mike.dagger2.di.feature2.FeatureTwoModule
import com.mike.dagger2.di.feature2.FeatureTwoSecondaryScreenModule

class App : Application() {
    companion object {
        lateinit var appComponent: AppComponent

        lateinit var featureOneComponent: FeatureOneComponent
        lateinit var featureOneMainScreenComponent: FeatureOneMainScreenComponent
        lateinit var featureOneSecondaryScreenComponent: FeatureOneSecondaryScreenComponent

        lateinit var featureTwoComponent: FeatureTwoComponent
        lateinit var featureTwoMainScreenComponent: FeatureTwoMainScreenComponent
        lateinit var featureTwoSecondaryScreenComponent: FeatureTwoSecondaryScreenComponent

    }

    override fun onCreate() {
        super.onCreate()

        appComponent = buildAppComponent()

        featureOneComponent = buildFeatureOneComponent()
        featureOneMainScreenComponent = buildFeatureOneMainScreenComponent()
        featureOneSecondaryScreenComponent = buildFeatureOneSecondaryScreenComponent()

        featureTwoComponent = buildFeatureTwoComponent()
        featureTwoMainScreenComponent = buildFeatureTwoMainScreenComponent()
        featureTwoSecondaryScreenComponent = buildFeatureTwoSecondaryScreenComponent()
    }

    private fun buildAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .utilsModule(UtilsModule("application"))
                .build()
    }

    private fun buildFeatureOneComponent(): FeatureOneComponent {
        return appComponent.plusFeatureOneComponent(FeatureOneModule("featureOne"))
    }

    private fun buildFeatureOneMainScreenComponent(): FeatureOneMainScreenComponent {
        return featureOneComponent.plusFeatureOneMainScreenComponent(FeatureOneMainScreenModule("featureOneMain"))
    }

    private fun buildFeatureOneSecondaryScreenComponent(): FeatureOneSecondaryScreenComponent {
        return featureOneComponent.plusFeatureOneSecondaryScreenComponent(FeatureOneSecondaryScreenModule("featureOneSecondary"))
    }

    private fun buildFeatureTwoComponent(): FeatureTwoComponent {
        return appComponent.plusFeatureTwoComponent(FeatureTwoModule("featureTwo"))
    }

    private fun buildFeatureTwoMainScreenComponent(): FeatureTwoMainScreenComponent {
        return featureTwoComponent.plusFeatureTwoMainScreenComponent(FeatureTwoMainScreenModule("featureTwoMain"))
    }

    private fun buildFeatureTwoSecondaryScreenComponent(): FeatureTwoSecondaryScreenComponent {
        return featureTwoComponent.plusFeatureTwoSecondaryScreenComponent(FeatureTwoSecondaryScreenModule("featureTwoSecondary"))
    }

}
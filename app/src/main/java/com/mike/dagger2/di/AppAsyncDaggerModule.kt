package com.mike.dagger2.di

import android.util.Log
import com.mike.dagger2.utils.AsyncInitUtil
import dagger.Module
import dagger.Provides
import dagger.Lazy
import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.ObservableOnSubscribe
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Singleton

@Module
class AppAsyncDaggerModule {
    companion object {
        private const val TAG = "AppAsyncDaggerModule"
    }

    @Singleton
    @Provides
    fun provideAsyncInitUtil(): AsyncInitUtil {
        Log.d(TAG, "provideAsyncInitUtil called")
        val util = AsyncInitUtil()
        util.init()
        return util
    }

    @Singleton
    @Provides
    fun provideAsyncInitUtilObservalbe(lazyAsynchInitUtil: Lazy<AsyncInitUtil>): Observable<AsyncInitUtil> {
        Log.d(TAG, "provideAsyncInitUtilObservable called")
        return Observable.create (object : ObservableOnSubscribe<AsyncInitUtil>{
            override fun subscribe(emitter: ObservableEmitter<AsyncInitUtil>) {
                emitter.onNext(lazyAsynchInitUtil.get())
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }

}
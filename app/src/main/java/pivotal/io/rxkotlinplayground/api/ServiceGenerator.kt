package pivotal.io.rxkotlinplayground.api

import okhttp3.OkHttpClient
import pivotal.io.rxkotlinplayground.interceptors.LoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object  ServiceGenerator {


    fun <T> create(serviceClass: Class<T>, baseUrl: String): T {
        val client = OkHttpClient.Builder().apply {
            interceptors().add(LoggingInterceptor())
        }.build()

        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()

        return retrofit.create(serviceClass)
    }

}

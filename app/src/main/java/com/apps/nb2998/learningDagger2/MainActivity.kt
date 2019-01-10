package com.apps.nb2998.learningDagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //    private lateinit var car: Car
    @Inject
    lateinit var car: Car  // field cannat be private or final for field injection
    // but doing this not enough, car.drive() gives NPE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.create()
//        car = carComponent.car  // constructor injection

        carComponent.inject(this); // field injection- tell dagger to take our activity and inject variables annotated with @Inject
        // as activity doesn't have constructor so has to be injected manually via inject() on component
        car.drive();
    }
}

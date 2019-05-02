package com.apps.nb2998.learningDagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.apps.nb2998.learningDagger2.car.Car
import com.apps.nb2998.learningDagger2.dagger.CarComponent
import com.apps.nb2998.learningDagger2.dagger.DaggerCarComponent
import com.apps.nb2998.learningDagger2.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //    private lateinit var car: Car
    @Inject
    lateinit var car: Car  // field cannat be private or final for field injection
    // but doing this not enough, car.drive() gives NPE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val carComponent: CarComponent = DaggerCarComponent.create()
////        car = carComponent.car  // constructor injection
//
//        carComponent.inject(this); // field injection- tell dagger to take our activity and inject variables annotated with @Inject
//        // as activity doesn't have constructor so has to be injected manually via inject() on component
//        car.drive();


        // part 7 -Injecting values at runtime
        // create method not available- only avilable if no modules in the component takes arguments
        // use builder instead

//        val carComponent: CarComponent = DaggerCarComponent.builder()
//                .dieselEngineModule(DieselEngineModule(100))
//                .build()
//        carComponent.inject(this)
//        car.drive()


        // wheels method strikethrough as deprecated because instance of it cannot be created as all provides methods static
        // not necessary but to make it work - make the Wheels Module class abstract
        // benefit- dagger will not allow if all methods not abstract
        // therefore, if al methods of Module aare static make the class abstract!!


//        **********************
        // Part 8 using Component.Builder and BindsInstance to pass variable directly
        val carComponent: CarComponent = DaggerCarComponent.builder()
                .horsepower(100)
                .build()
        carComponent.inject(this)
        car.drive()
    }
}

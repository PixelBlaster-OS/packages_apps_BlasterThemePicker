package com.blaster.android.customization.picker

import android.app.Application;
import com.android.wallpaper.module.InjectorProvider;
import com.blaster.android.customization.module.BlasterThemePickerInjector;
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp(Application::class)
class BlasterCustomizationPickerApplication : Hilt_BlasterCustomizationPickerApplication() {

  @Inject
  lateinit var injector: BlasterThemePickerInjector

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(injector);
    }

}

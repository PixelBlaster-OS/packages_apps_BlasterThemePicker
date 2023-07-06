package com.blaster.android.customization.picker

import android.app.Application;

import com.android.wallpaper.module.InjectorProvider;

import com.blaster.android.customization.module.BlasterThemePickerInjector;

public class BlasterCustomizationPickerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(BlasterThemePickerInjector());
    }

}

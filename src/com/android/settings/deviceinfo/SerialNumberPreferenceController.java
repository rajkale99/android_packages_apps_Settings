/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.deviceinfo;

import android.content.Context;
import android.os.Build;

import com.android.settings.core.PreferenceControllerMixin;
import com.android.settingslib.deviceinfo.AbstractSerialNumberPreferenceController;

/**
 * Preference controller for displaying device serial number. Wraps {@link Build#getSerial()}.
 *
 * deprecated because this preference is no longer used in About Phone V2
 */
@Deprecated
public class SerialNumberPreferenceController extends
        AbstractSerialNumberPreferenceController implements
        PreferenceControllerMixin {
    public SerialNumberPreferenceController(Context context) {
        super(context);
    }

    // This space intentionally left blank
}

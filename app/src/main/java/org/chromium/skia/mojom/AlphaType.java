
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     skia/public/interfaces/image_info.mojom
//

package org.chromium.skia.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class AlphaType {


    public static final int UNKNOWN = 0;

    public static final int ALPHA_TYPE_OPAQUE = UNKNOWN + 1;

    public static final int PREMUL = ALPHA_TYPE_OPAQUE + 1;

    public static final int UNPREMUL = PREMUL + 1;

    public static final int MIN_VALUE = (int) (0);
    public static final int MAX_VALUE = (int) (3);

    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private AlphaType() {}

}
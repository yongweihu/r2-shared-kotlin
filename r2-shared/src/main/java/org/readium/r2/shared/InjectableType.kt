/*
 * Module: r2-shared-kotlin
 * Developers: Aferdita Muriqi
 *
 * Copyright (c) 2019. Readium Foundation. All rights reserved.
 * Use of this source code is governed by a BSD-Style license which is detailed in the
 * LICENSE file present in the project repository where this source code is maintained.
 */

package org.readium.r2.shared

import java.io.Serializable

enum class Injectable(val rawValue: String): Serializable {
    Script("scripts"),
    Font("fonts"),
    Style("styles");

    companion object {
        operator fun invoke(rawValue: String) = values().firstOrNull { it.rawValue == rawValue }
    }
}

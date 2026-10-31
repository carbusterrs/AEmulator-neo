package app.aemu.update

import org.junit.Assert.*
import org.junit.Test

class UpdateAssetPolicyTest {
    private val plus = "AEmulator-Plus-0.0.0.2.1-io.carbusterrs.aeneo.apk"

    @Test fun choosesPlusApkRegardlessOfAssetOrder() {
        assertEquals(plus, listOf(plus, "notes.txt").firstOrNull { UpdateAssetPolicy.matches(it, "io.carbusterrs.aeneo") })
        assertEquals(plus, listOf("notes.txt", plus).firstOrNull { UpdateAssetPolicy.matches(it, "io.carbusterrs.aeneo") })
    }
    @Test fun neverMatchesOldSunsetOrCloneApks() {
        assertFalse(UpdateAssetPolicy.matches("AEmulator-Sunset-0.0.0.3-sunset.30-app.aemu.apk", "io.carbusterrs.aeneo"))
        assertFalse(UpdateAssetPolicy.matches("AEmulator-Sunset-0.0.0.3-sunset.30-app.aemu.clone.apk", "io.carbusterrs.aeneo"))
    }
    @Test fun otherPackagesNeverMatch() {
        assertFalse(UpdateAssetPolicy.matches(plus, "app.aemu"))
        assertFalse(UpdateAssetPolicy.matches(plus, "app.aemu.clone"))
        assertFalse(UpdateAssetPolicy.matches(plus, "other.app"))
    }
    @Test fun matchingIsCaseInsensitiveButRequiresExactPackageSuffix() {
        assertTrue(UpdateAssetPolicy.matches(plus.uppercase(), "io.carbusterrs.aeneo"))
        assertFalse(UpdateAssetPolicy.matches("$plus.zip", "io.carbusterrs.aeneo"))
        assertFalse(UpdateAssetPolicy.matches("$plus.asc", "io.carbusterrs.aeneo"))
        assertFalse(UpdateAssetPolicy.matches("prefix-io.carbusterrs.aeneo.fake.apk", "io.carbusterrs.aeneo"))
    }
}

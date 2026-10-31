package app.aemu.core

import org.junit.Assert.assertEquals
import org.junit.Test

class BootTimeFormatTest {
    @Test fun seconds() {
        assertEquals("0s", BootTimeFormat.format(0))
        assertEquals("8s", BootTimeFormat.format(8))
        assertEquals("59s", BootTimeFormat.format(59))
    }
    @Test fun minutes() {
        assertEquals("1m 0s", BootTimeFormat.format(60))
        assertEquals("1m 5s", BootTimeFormat.format(65))
        assertEquals("12m 30s", BootTimeFormat.format(750))
        assertEquals("59m 59s", BootTimeFormat.format(3599))
    }
    @Test fun hours() {
        assertEquals("1h 0m 0s", BootTimeFormat.format(3600))
        assertEquals("1h 2m 5s", BootTimeFormat.format(3725))
        assertEquals("23h 59m 59s", BootTimeFormat.format(86399))
    }
    @Test fun days() {
        assertEquals("1d 0h 0m 0s", BootTimeFormat.format(86400))
        assertEquals("1d 3h 4m 5s", BootTimeFormat.format(97445))
    }
    @Test fun negativeIsZero() {
        assertEquals("0s", BootTimeFormat.format(-5))
    }
}

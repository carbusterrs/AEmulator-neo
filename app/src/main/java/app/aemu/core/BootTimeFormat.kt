object BootTimeFormat {
    fun format(totalSeconds: Long): String {
        val s = totalSeconds.coerceAtLeast(0)
        val d = s / 86400; val h = s % 86400 / 3600
        val m = s % 3600 / 60; val sec = s % 60
        return when {
            s < 60 -> "${sec}s"
            s < 3600 -> "${m}m ${sec}s"
            s < 86400 -> "${h}h ${m}m ${sec}s"
            else -> "${d}d ${h}h ${m}m ${sec}s"
        }
    }
}

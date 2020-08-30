import java.text.SimpleDateFormat
import java.util.*

object ApplicationId {
    const val id = "nz.co.spark.core.utils"
}

object Releases {
    val versionCode = getDateTimestamp()
    val versionName = "1.0.0"
}

object SDK {
    const val compileSdk = 29
    const val minSdk = 23
    const val targetSdk = 29
}

object Java {
    const val jvmTarget = 1.8
}

private fun getDateTimestamp(): Int {
    val pattern = "yyMMddHHmm"
    val simpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault(Locale.Category.FORMAT))
    return simpleDateFormat.format(Date()).toInt()
}

package `in`.sha.coreutil

import java.text.DecimalFormat

fun Double.formatAsAmount() : String {
    return DecimalFormat("0.#").format(this)
}
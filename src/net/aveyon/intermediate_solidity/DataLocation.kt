package net.aveyon.intermediate_solidity

enum class DataLocation {
    MEMORY, CALLDATA;

    companion object {
        fun parse(s: String): DataLocation {
            return when (s) {
                "memory" -> MEMORY
                "calldata" -> CALLDATA
                else -> {
                    MEMORY
                }
            }
        }
    }
}

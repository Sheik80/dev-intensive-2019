package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?,String?>{

        if (fullName.isNullOrBlank()) return null to null
        val parts : List<String>? = fullName?.split(" ")

        var firstName: String? = parts?.getOrNull(0)?.trim()
        var lastName: String? = parts?.getOrNull(1)?.trim()
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " "): String {
        TODO("not implemented");
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO("not implemented")

    }
}
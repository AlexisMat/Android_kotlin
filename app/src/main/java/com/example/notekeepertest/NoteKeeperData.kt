package com.example.notekeepertest

data class CourseInfo(val courseId: String, val courseTitle: String) {
    override fun toString(): String {
        return courseTitle
    }
}

data class NoteInfo(
    var course: CourseInfo? = null,
    var title: String? = null,
    var text: String? = null
)

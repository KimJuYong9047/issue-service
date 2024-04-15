package com.fastcampus.issueservice.domain.enums

enum class IssueType {

    BUG, TASK;

    companion object {
        operator fun invoke(type:String) = valueOf(type.uppercase()) //operator invoke를 사용하면 함수명 없이 사용 가능
    }
}

package com.fastcampus.issueservice.model

import com.fastcampus.issueservice.domain.Issue
import com.fastcampus.issueservice.domain.IssuePriority
import com.fastcampus.issueservice.domain.IssueStatus
import com.fastcampus.issueservice.domain.IssueType
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class IssueRequest(
    val summary: String,
    val description: String,
    val type: IssueType,
    val priority: IssuePriority,
    val status: IssueStatus,
)

data class IssueResponse(
    val id : Long,
    val summary: String,
    val description: String,
    val userId: Long,
    val type: IssueType,
    val priority: IssuePriority,
    val status: IssueStatus,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val createdAt: LocalDateTime?,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val updateAt: LocalDateTime?,
){

    companion object{
        operator fun invoke(issue:Issue) =
            with(issue){
                IssueResponse(
                    id = id!!,
                    summary = summary,
                    description=description,
                    userId=userId,
                    type=type,
                    priority = priority,
                    status = status,
                    createdAt = createdAt,
                    updateAt = updatedAt,
                )
            }
    }
}
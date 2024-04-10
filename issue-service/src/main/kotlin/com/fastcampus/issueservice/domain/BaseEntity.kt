package com.fastcampus.issueservice.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)//특정 이벤트가 발생하면 정해진 콜백을 실행 AuditingEntityListener가 있어야 아래 CreatedDate가 실행됨
abstract class BaseEntity(
    @CreatedDate //생성일시
    var createdAt: LocalDateTime? = null,
    @LastModifiedDate //수정일시
    var updatedAt: LocalDateTime? = null,
) {


}
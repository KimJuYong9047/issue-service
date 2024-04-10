package com.fastcampus.issueservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing // 이게 있어야 AuditingEntityListener가 실행 가능
class FastcampusIssueServiceApplication

fun main(args: Array<String>) {
    runApplication<FastcampusIssueServiceApplication>(*args)
}

package com.fastcampus.issueservice.web

import com.fastcampus.issueservice.config.AuthUser
import com.fastcampus.issueservice.model.IssueRequest
import com.fastcampus.issueservice.service.IssueService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/issues")
class IssueController(
    private val issueService: IssueService
) {

    //HandlerMethodArgumentResolver가 있어서 컨트롤러에서 바로 AuthUser를 가져올 수 있고
    //AuthUser가 있는 경우에는 HandlerMethodArgumentResolver에 등록된 Resolver를 찾아서 반복문을 돌면서 서포츠 파라미터의
    //조건이 일치하는 경우 ResolveArgument가 동작하게 되고 Authuser가 더미 클래스로 생성됨
    @PostMapping
    fun create(
        authUser: AuthUser,
        @RequestBody request: IssueRequest,
    ) = issueService.create(authUser.userId, request)

}
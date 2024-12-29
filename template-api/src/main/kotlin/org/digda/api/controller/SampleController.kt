package org.digda.api.controller

import org.digda.service.SampleService
import org.digda.web.bind.annotation.RestApiController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RestApiController
class SampleController(
    private val sampleService: SampleService
) {

    @GetMapping("/sample")
    fun getSample(): String {
        return "Hello World!"
    }

    @PostMapping("/sample")
    fun saveSample(@RequestParam name: String): Boolean {
        return sampleService.saveSample(name)
    }
}
package org.digda.service

import org.digda.entity.Sample
import org.digda.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val sampleRepository: SampleRepository,
) {

    fun getSampleMessage(): String {
        return "Hello World!"
    }

    fun saveSample(name: String): Boolean {
        sampleRepository.save(Sample(name = name))
        return true
    }
}
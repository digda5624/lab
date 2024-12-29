package org.digda.repository

import org.digda.entity.Sample
import org.springframework.data.jpa.repository.JpaRepository

interface SampleRepository: JpaRepository<Sample, Long> {
}
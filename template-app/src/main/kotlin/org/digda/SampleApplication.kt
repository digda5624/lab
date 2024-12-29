package org.digda

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(basePackageClasses = [SampleApplication::class])
@EntityScan(basePackageClasses = [SampleApplication::class])
@Configuration
class SampleApplication
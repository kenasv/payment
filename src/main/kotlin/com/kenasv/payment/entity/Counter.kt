package com.kenasv.payment.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import java.util.*

@JmixEntity
@Table(name = "COUNTER")
@Entity
open class Counter {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinColumn(name = "ADDRESS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var address: Houseroom? = null

    @NotNull
    @InstanceName
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Column(name = "NOMER")
    var nomer: String? = null

}
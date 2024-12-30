package com.kenasv.payment.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import java.util.*

@JmixEntity
@Table(name = "HOUSEROOM", uniqueConstraints = [
    UniqueConstraint(name = "IDX_HOUSEROOM_UNQ", columnNames = ["ID"])
])
@Entity
open class Houseroom {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "REGION", nullable = false)
    @NotNull
    var region: String? = null

    @Column(name = "CITY", nullable = false)
    @NotNull
    var city: String? = null

    @Column(name = "STREET", nullable = false)
    @NotNull
    var street: String? = null

    @Column(name = "HOUSE", nullable = false)
    @NotNull
    var house: String? = null

    @Column(name = "APARTMENTNUMBER", nullable = false)
    @NotNull
    var apartmentnumber: String? = null

    @Column(name = "EGRN")
    var egrn: String? = null

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null

}
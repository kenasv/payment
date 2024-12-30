package com.kenasv.payment.entity

import io.jmix.core.MetadataTools
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.DependsOnProperties
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import java.util.*

@JmixEntity
@Table(name = "HOUSEROOM")
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

    @InstanceName
    @DependsOnProperties("region", "city", "street", "house", "apartmentnumber")
    fun getInstanceName(metadataTools: MetadataTools): String =
        "${metadataTools.format(region)} ${metadataTools.format(city)} ${metadataTools.format(street)} ${metadataTools.format(house)} ${metadataTools.format(apartmentnumber)}".trim()
}
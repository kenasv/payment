package com.kenasv.payment.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import jakarta.persistence.*
import java.util.*

@JmixEntity
@Table(name = "PAYMENTRECEIPT", uniqueConstraints = [
    UniqueConstraint(name = "IDX_PAYMENTRECEIPT_UNQ", columnNames = ["ID"])
])
@Entity
open class Paymentreceipt {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Temporal(TemporalType.DATE)
    @Column(name = "DATAFACTPAYMENT")
    var datafactpayment: Date? = null

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null

}
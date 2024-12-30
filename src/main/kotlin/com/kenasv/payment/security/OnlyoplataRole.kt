package com.kenasv.payment.security

import com.kenasv.payment.entity.Paymentreceipt
import io.jmix.security.model.EntityAttributePolicyAction
import io.jmix.security.model.EntityPolicyAction
import io.jmix.security.role.annotation.EntityAttributePolicy
import io.jmix.security.role.annotation.EntityAttributePolicyContainer
import io.jmix.security.role.annotation.EntityPolicy
import io.jmix.security.role.annotation.ResourceRole
import io.jmix.securityflowui.role.annotation.MenuPolicy
import io.jmix.securityflowui.role.annotation.ViewPolicy

@ResourceRole(name = "onlyoplata", code = OnlyoplataRole.CODE)
interface OnlyoplataRole {

    companion object {
        const val CODE = "onlyoplata"
    }

    @MenuPolicy(menuIds = ["MyPaymentingView"])
    @ViewPolicy(viewIds = ["MyPaymentingView"])
    fun screens()

    @EntityAttributePolicyContainer(
        EntityAttributePolicy(
            entityClass = Paymentreceipt::class,
            attributes = ["*"],
            action = EntityAttributePolicyAction.MODIFY
        )
    )
    @EntityPolicy(entityClass = Paymentreceipt::class, actions = [EntityPolicyAction.ALL])
    fun paymentreceipt()
}
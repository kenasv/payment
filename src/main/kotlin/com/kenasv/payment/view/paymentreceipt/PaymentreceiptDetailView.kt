package com.kenasv.payment.view.paymentreceipt

import com.kenasv.payment.entity.Paymentreceipt
import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.EditedEntityContainer
import io.jmix.flowui.view.StandardDetailView
import io.jmix.flowui.view.ViewController
import io.jmix.flowui.view.ViewDescriptor

@Route(value = "paymentreceipts/:id", layout = MainView::class)
@ViewController(id = "Paymentreceipt.detail")
@ViewDescriptor(path = "paymentreceipt-detail-view.xml")
@EditedEntityContainer("paymentreceiptDc")
class PaymentreceiptDetailView : StandardDetailView<Paymentreceipt>() {
}
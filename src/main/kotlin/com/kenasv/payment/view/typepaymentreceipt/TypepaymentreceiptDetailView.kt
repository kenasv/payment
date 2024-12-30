package com.kenasv.payment.view.typepaymentreceipt

import com.kenasv.payment.entity.Typepaymentreceipt
import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.EditedEntityContainer
import io.jmix.flowui.view.StandardDetailView
import io.jmix.flowui.view.ViewController
import io.jmix.flowui.view.ViewDescriptor

@Route(value = "typepaymentreceipts/:id", layout = MainView::class)
@ViewController(id = "Typepaymentreceipt.detail")
@ViewDescriptor(path = "typepaymentreceipt-detail-view.xml")
@EditedEntityContainer("typepaymentreceiptDc")
class TypepaymentreceiptDetailView : StandardDetailView<Typepaymentreceipt>() {
}
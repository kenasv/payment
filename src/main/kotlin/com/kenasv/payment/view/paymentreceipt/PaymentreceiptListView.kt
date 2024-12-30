package com.kenasv.payment.view.paymentreceipt

import com.kenasv.payment.entity.Paymentreceipt
import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*


@Route(value = "paymentreceipts", layout = MainView::class)
@ViewController(id = "Paymentreceipt.list")
@ViewDescriptor(path = "paymentreceipt-list-view.xml")
@LookupComponent("paymentreceiptsDataGrid")
@DialogMode(width = "64em")
class PaymentreceiptListView : StandardListView<Paymentreceipt>() {
}
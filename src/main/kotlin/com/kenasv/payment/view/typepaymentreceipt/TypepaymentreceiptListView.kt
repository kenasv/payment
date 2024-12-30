package com.kenasv.payment.view.typepaymentreceipt

import com.kenasv.payment.entity.Typepaymentreceipt
import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*


@Route(value = "typepaymentreceipts", layout = MainView::class)
@ViewController(id = "Typepaymentreceipt.list")
@ViewDescriptor(path = "typepaymentreceipt-list-view.xml")
@LookupComponent("typepaymentreceiptsDataGrid")
@DialogMode(width = "64em")
class TypepaymentreceiptListView : StandardListView<Typepaymentreceipt>() {
}
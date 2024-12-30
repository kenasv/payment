package com.kenasv.payment.view.mypaymenting


import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.StandardView
import io.jmix.flowui.view.ViewController
import io.jmix.flowui.view.ViewDescriptor

@Route(value = "my-paymenting-view", layout = MainView::class)
@ViewController(id = "MyPaymentingView")
@ViewDescriptor(path = "my-paymenting-view.xml")
class MyPaymentingView : StandardView() {
}
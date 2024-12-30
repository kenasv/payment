package com.kenasv.payment.view.counter

import com.kenasv.payment.entity.Counter
import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.EditedEntityContainer
import io.jmix.flowui.view.StandardDetailView
import io.jmix.flowui.view.ViewController
import io.jmix.flowui.view.ViewDescriptor

@Route(value = "counters/:id", layout = MainView::class)
@ViewController(id = "Counter.detail")
@ViewDescriptor(path = "counter-detail-view.xml")
@EditedEntityContainer("counterDc")
class CounterDetailView : StandardDetailView<Counter>() {
}
package com.kenasv.payment.view.counter

import com.kenasv.payment.entity.Counter
import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*


@Route(value = "counters", layout = MainView::class)
@ViewController(id = "Counter.list")
@ViewDescriptor(path = "counter-list-view.xml")
@LookupComponent("countersDataGrid")
@DialogMode(width = "64em")
class CounterListView : StandardListView<Counter>() {
}
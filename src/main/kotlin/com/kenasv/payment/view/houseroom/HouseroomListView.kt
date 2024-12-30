package com.kenasv.payment.view.houseroom

import com.kenasv.payment.entity.Houseroom
import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*


@Route(value = "houserooms", layout = MainView::class)
@ViewController(id = "Houseroom.list")
@ViewDescriptor(path = "houseroom-list-view.xml")
@LookupComponent("houseroomsDataGrid")
@DialogMode(width = "64em")
class HouseroomListView : StandardListView<Houseroom>() {
}
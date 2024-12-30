package com.kenasv.payment.view.houseroom

import com.kenasv.payment.entity.Houseroom
import com.kenasv.payment.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.EditedEntityContainer
import io.jmix.flowui.view.StandardDetailView
import io.jmix.flowui.view.ViewController
import io.jmix.flowui.view.ViewDescriptor

@Route(value = "houserooms/:id", layout = MainView::class)
@ViewController(id = "Houseroom.detail")
@ViewDescriptor(path = "houseroom-detail-view.xml")
@EditedEntityContainer("houseroomDc")
class HouseroomDetailView : StandardDetailView<Houseroom>() {
}
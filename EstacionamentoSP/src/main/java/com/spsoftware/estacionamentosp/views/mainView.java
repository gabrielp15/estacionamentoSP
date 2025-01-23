package com.spsoftware.estacionamentosp.views;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;


@PageTitle("Home")
@Route("/home")
//@Menu(order = 0, icon = LineAwesomeIconUrl.HOME_SOLID)
@RolesAllowed("USER")
@Uses(Icon.class)
public class mainView extends Composite<VerticalLayout> {

    public mainView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        FormLayout formLayout2Col = new FormLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        Hr hr = new Hr();
        FormLayout formLayout3Col = new FormLayout();
        Button buttonPrimary3 = new Button();
        Button buttonPrimary4 = new Button();
        Button buttonPrimary5 = new Button();
        Hr hr2 = new Hr();
        FormLayout formLayout2Col2 = new FormLayout();
        Button buttonPrimary6 = new Button();
        Button buttonPrimary7 = new Button();
        Hr hr3 = new Hr();
        Grid basicGrid = new Grid();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h1.setText("Seja bem-vindo!");
        h1.setWidth("max-content");
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        buttonPrimary.setText("Registrar Entrada");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Registrar Saída");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        buttonPrimary3.setText("Cadastrar novo cliente");
        buttonPrimary3.setWidth("min-content");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary4.setText("Ver clientes cadastrados");
        buttonPrimary4.setWidth("min-content");
        buttonPrimary4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary5.setText("Alterar/Excluir cliente");
        buttonPrimary5.setWidth("min-content");
        buttonPrimary5.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        formLayout2Col2.setWidth("100%");
        buttonPrimary6.setText("Ver relatório diário");
        buttonPrimary6.setWidth("min-content");
        buttonPrimary6.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary7.setText("Ver relatório Mensal");
        buttonPrimary7.setWidth("min-content");
        buttonPrimary7.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        basicGrid.setWidth("100%");
        basicGrid.getStyle().set("flex-grow", "0");
        getContent().add(layoutRow);
        layoutRow.add(h1);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(buttonPrimary);
        formLayout2Col.add(buttonPrimary2);
        layoutColumn2.add(hr);
        layoutColumn2.add(formLayout3Col);
        formLayout3Col.add(buttonPrimary3);
        formLayout3Col.add(buttonPrimary4);
        formLayout3Col.add(buttonPrimary5);
        layoutColumn2.add(hr2);
        layoutColumn2.add(formLayout2Col2);
        formLayout2Col2.add(buttonPrimary6);
        formLayout2Col2.add(buttonPrimary7);
        layoutColumn2.add(hr3);
        layoutColumn2.add(basicGrid);
    }
}
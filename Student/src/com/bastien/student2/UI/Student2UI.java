package com.bastien.student2.UI;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("student2")
public class Student2UI extends UI {

	/*@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponent(button);
	}*/
	
	@SuppressWarnings("deprecation")
	@Override
    protected void init(VaadinRequest request) {
        
        final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

        // ----- Title ----- //
		Label title = new Label("<h1>My Student Application</h1>\nEnter a new student");
		title.setContentMode(Label.CONTENT_XHTML);
		layout.addComponent(title);
		
        
        // ----- Content ----- //
    }

}
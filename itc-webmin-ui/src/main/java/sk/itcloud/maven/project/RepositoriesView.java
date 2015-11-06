package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.GridLayoutView;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Dependency;
import sk.itcloud.maven.model.form.Scm;

public class RepositoriesView extends HorizontalTabView implements View
{

	public static final String VIEW_NAME = "Repositories";
	protected AutoForm scmView = new AutoForm();
	protected AutoForm distributionManagementView;

	public RepositoriesView(Model model)
	{
		super();
		scmView.setFormData(new Scm());
		distributionManagementView = new AutoForm();
		// distributionManagementView.setFormData(new DistributionManagement());
		getMenu().addView(scmView, "Source Control Management", "Source Control");
		getMenu().addView(distributionManagementView, "Distribution", "Distribution");
	}

	public RepositoriesView(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}
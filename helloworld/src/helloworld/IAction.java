package helloworld;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.osgi.container.Module;
import org.eclipse.ui.PlatformUI;

public class IAction {
	private class RemoveCurrentGraphAction extends Action {
	    @Override
	    public void run() {
	        //updateWith(new Module());
	    }

	    public RemoveCurrentGraphAction() {
	        setToolTipText("Reset to empty graph");
	    }

	    @Override
	    public int getStyle() {
	        return 1;
	        //IAction.AS_PUSH_BUTTON;
	    }

	    @Override
	    public ImageDescriptor getImageDescriptor() {
	        return PlatformUI.getWorkbench().getSharedImages()
	                .getImageDescriptor(org.eclipse.ui.ISharedImages.IMG_ELCL_REMOVE);
	    }
	}
//IActionBars bars = getViewSite().getActionBars();
	//bars.getToolBarManager().add(new RemoveCurrentGraphAction());
}

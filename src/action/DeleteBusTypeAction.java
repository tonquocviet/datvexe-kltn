package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import model.bo.BusTypeBO;

public class DeleteBusTypeAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		int bustypeId = Integer.parseInt(request.getParameter("id"));
		(new BusTypeBO()).removeBusByBusType(bustypeId);
		return mapping.findForward("success");
	}
	
}
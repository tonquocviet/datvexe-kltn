package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import model.bo.TicKetBO;

public class DeleteTicketManageAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int t = Integer.parseInt(request.getParameter("id"));
		(new TicKetBO()).removeTicketByTicket(t);
		return mapping.findForward("success");
	}
	
}

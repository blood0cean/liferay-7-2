package blood0cean.com.github.portlet;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import blood0cean.com.github.constants.OfficeManagementPortletKeys;
import blood0cean.com.github.office.schedule.model.Office;
import blood0cean.com.github.office.schedule.service.OfficeLocalService;

/**
 * @author andrea
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.office.management",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Office Management",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + OfficeManagementPortletKeys.OFFICEMANAGEMENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OfficeManagementPortlet extends MVCPortlet {
	
	public void addOffice(ActionRequest request, ActionResponse response) throws PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Office.class.getName(), request);
		
		long officeId = ParamUtil.getLong(request, "officeId");
		String name = ParamUtil.getString(request, "name");
		String description = ParamUtil.getString(request, "description");
		boolean active = ParamUtil.getBoolean(request, "active");
		int maxPeopleAllowed = ParamUtil.getInteger(request, "maxPeopleAllowed");
		
		if (officeId == 0) {
			_officeLocalService.addOffice(serviceContext.getUserId(), name, description, active, maxPeopleAllowed, serviceContext);
		} else {
			_officeLocalService.updateOffice(serviceContext.getUserId(), officeId, name, description, active, maxPeopleAllowed, serviceContext);			
		}
	}
	
	public void deleteOffice(ActionRequest request, ActionResponse response) throws PortalException {
		long officeId = ParamUtil.getLong(request,  "officeId");
		
		_officeLocalService.deleteOffice(officeId);
	}
	
	@Reference
	private OfficeLocalService _officeLocalService;
}
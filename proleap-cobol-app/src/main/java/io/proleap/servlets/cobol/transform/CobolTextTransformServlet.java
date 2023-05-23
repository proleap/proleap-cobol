package io.proleap.servlets.cobol.transform;

import static io.proleap.context.ApplicationContextUtils.getBean;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.proleap.service.transform.cobol.CobolTextTransformService;
import io.proleap.servlets.AbstractServlet;

@WebServlet(CobolTextTransformServlet.PATTERN)
public class CobolTextTransformServlet extends AbstractServlet {

	public static final String PATTERN = "/v1/cobol/transform/text";

	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(final HttpServletRequest req, final HttpServletResponse resp) {
		enableCors(req, resp);
		disableCache(resp);
		setContentTypeTextPlain(resp);

		getBean(CobolTextTransformService.class).transform(req, resp);
	}
}

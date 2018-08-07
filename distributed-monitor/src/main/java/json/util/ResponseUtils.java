package json.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtils {

	public static void renderJson(HttpServletResponse response,String text){
		render(response,"text/plain;charset=UTF-8",text);
	}

	private static void render(HttpServletResponse response, String contextType,
			String text) {
		response.setContentType(contextType);
		response.setCharacterEncoding("utf-8");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setDateHeader("Expires", 0);
		try {
			response.getWriter().write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
